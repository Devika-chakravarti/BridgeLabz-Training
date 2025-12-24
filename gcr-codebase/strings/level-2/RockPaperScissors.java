import java.util.*;
public class RockPaperScissors{

    	
	// Method to generate computer choice randomly by using Math.random() method
    	public static String getComputerChoice(){
        	int choice = (int)(Math.random() * 3); // 0, 1, or 2
        	switch(choice){
            		case 0: return "Rock";
            		case 1: return "Paper";
            		default: return "Scissors";
        	}
    	}


    	// Method to find winner between user and computer
    	// Returns "User", "Computer", or "Tie"
    	public static String findWinner(String userChoice, String computerChoice){
        	if(userChoice.equalsIgnoreCase(computerChoice)){
            		return "Tie";
        	}
        	switch(userChoice.toLowerCase()){
            		case "rock":
                		return (computerChoice.equalsIgnoreCase("Scissors")) ? "User" : "Computer";
            		case "paper":
                		return (computerChoice.equalsIgnoreCase("Rock")) ? "User" : "Computer";
            		case "scissors":
                	return (computerChoice.equalsIgnoreCase("Paper")) ? "User" : "Computer";
            		default:
                	return "Invalid";
        	}
    	}


    	// Method to calculate stats and winning percentage
    	public static String[][] calculateStats(String[] winners){
        	int userWins = 0, computerWins = 0, ties = 0;
        	int totalGames = winners.length;
        	for(String winner : winners){
            		if(winner.equals("User")) userWins++;
            		else if(winner.equals("Computer")) computerWins++;
            		else if(winner.equals("Tie")) ties++;
        	}

        	double userPercentage = ((double) userWins / totalGames) * 100;
        	double computerPercentage = ((double) computerWins / totalGames) * 100;

        	String[][] stats = new String[4][3];

        	stats[0][0] = "Player Wins"; stats[0][1] = String.valueOf(userWins); stats[0][2] = String.format("%.2f%%", userPercentage);
        	stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins); stats[1][2] = String.format("%.2f%%", computerPercentage);
        	stats[2][0] = "Ties"; stats[2][1] = String.valueOf(ties); stats[2][2] = "-";
        	stats[3][0] = "Total Games"; stats[3][1] = String.valueOf(totalGames); stats[3][2] = "-";

        	return stats;
    	}


    	// Method to display results and stats
    	public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats){
        	System.out.println("\nGame Results:");
        	System.out.println("Game\tUser\tComputer\tWinner");
        	System.out.println("-----------------------------------------");
        	for(int i = 0; i < userChoices.length; i++){
            		System.out.printf("%d\t%s\t%s\t\t%s\n", i+1, userChoices[i],computerChoices[i], winners[i]);
        	}

        	System.out.println("\nStatistics:");
        	System.out.println("Category\tCount\tWinning Percentage");
        	System.out.println("-----------------------------------------");
        	for(String[] row : stats){
            		System.out.printf("%s\t%s\t%s\n", row[0], row[1], row[2]);
        	}
    	}

 
   	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	System.out.print("Enter the number of games to play: ");
        	int n = input.nextInt();
        	input.nextLine(); // consume newline

        	String[] userChoices = new String[n];
        	String[] computerChoices = new String[n];
        	String[] winners = new String[n];

        	for(int i = 0; i < n; i++){
            		System.out.print("\nGame " + (i+1) + " - Enter your choice (Rock/Paper/Scissors): ");
            		String userChoice = input.nextLine();
            		userChoices[i] = userChoice;

            		String computerChoice = getComputerChoice();
            		computerChoices[i] = computerChoice;

            		String winner = findWinner(userChoice, computerChoice);
            		winners[i] = winner;

            		System.out.println("Computer chose: " + computerChoice);
            	
			System.out.println("Winner: " + winner);
        	}

        	// Calculate stats
        	String[][] stats = calculateStats(winners);

        	// Display results
        	displayResults(userChoices, computerChoices, winners, stats);

        	input.close();
    	}


}
