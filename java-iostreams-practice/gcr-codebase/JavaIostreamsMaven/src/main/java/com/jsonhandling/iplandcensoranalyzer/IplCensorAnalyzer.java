/*Develop a Java application that reads IPL match data from JSON and CSV files, processes the data based on defined censorship rules, and writes the sanitized data back to new files.
*/

package com.jsonhandling.iplandcensoranalyzer;

import java.io.File;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.databind.MappingIterator;

public class IplCensorAnalyzer {

	public static void main(String[] args) {
		try {
			ObjectMapper jsonMapper = new ObjectMapper();
			CsvMapper csvMapper = new CsvMapper();

			File csvInput = new File("ipl_matches.csv");
			File jsonInput = new File("ipl_matches.json");

			List<IplMatch> matches = new ArrayList<>();
			if (jsonInput.exists()) {
				IplMatch[] jsonMatches = jsonMapper.readValue(jsonInput, IplMatch[].class);
				matches.addAll(Arrays.asList(jsonMatches));
			}
			if (csvInput.exists()) {
				CsvSchema schema = CsvSchema.emptySchema().withHeader();
				MappingIterator<Map> iterator = csvMapper.readerFor(Map.class).with(schema).readValues(csvInput);
				List<Map> csvRows = iterator.readAll();
				for (Map row : csvRows) {
					IplMatch match = new IplMatch();
					match.setMatch_id(Integer.parseInt(row.get("match_id").toString()));
					match.setTeam1(row.get("team1").toString());
					match.setTeam2(row.get("team2").toString());

					Map<String, Integer> score = new LinkedHashMap<>();
					score.put(match.getTeam1(), Integer.parseInt(row.get("score_team1").toString()));
					score.put(match.getTeam2(), Integer.parseInt(row.get("score_team2").toString()));

					match.setScore(score);
					match.setWinner(row.get("winner").toString());
					match.setPlayer_of_match(row.get("player_of_match").toString());

					matches.add(match);
				}
			}
			for (IplMatch m : matches) {
				String t1 = m.getTeam1();
				String t2 = m.getTeam2();

				m.setTeam1(maskTeam(t1));
				m.setTeam2(maskTeam(t2));
				m.setWinner(maskTeam(m.getWinner()));
				m.setPlayer_of_match("REDACTED");

				Map<String, Integer> newScore = new LinkedHashMap<>();
				newScore.put(m.getTeam1(), m.getScore().get(t1));
				newScore.put(m.getTeam2(), m.getScore().get(t2));
				m.setScore(newScore);
			}

			jsonMapper.writerWithDefaultPrettyPrinter().writeValue(new File("ipl_matches_censored.json"), matches);

			CsvSchema outSchema = CsvSchema.builder().addColumn("match_id").addColumn("team1").addColumn("team2")
					.addColumn("score_team1").addColumn("score_team2").addColumn("winner").addColumn("player_of_match")
					.build().withHeader();

			List<Map<String, Object>> csvOutput = new ArrayList<>();

			for (IplMatch m : matches) {
				Map<String, Object> row = new LinkedHashMap<>();
				row.put("match_id", m.getMatch_id());
				row.put("team1", m.getTeam1());
				row.put("team2", m.getTeam2());

				List<Integer> scores = new ArrayList<>(m.getScore().values());
				row.put("score_team1", scores.get(0));
				row.put("score_team2", scores.get(1));
				row.put("winner", m.getWinner());
				row.put("player_of_match", m.getPlayer_of_match());
				csvOutput.add(row);
			}

			csvMapper.writerFor(List.class).with(outSchema).writeValue(new File("ipl_matches_censored.csv"), csvOutput);

			System.out.println("Censored JSON & CSV generated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String maskTeam(String team) {
		if (team.contains(" ")) {
			return team.substring(0, team.indexOf(" ")) + " ***";
		}
		return team;
	}
}
