// Convert a list of Java objects into a JSON array.

package com.jsonhandling.jsonarray;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ListToJsonArray {
	public static void main(String[] args) {
		try {
			List<Car> carList = new ArrayList<>();

			carList.add(new Car(1, "Toyota", "Corolla"));
			carList.add(new Car(2, "Honda", "City"));
			carList.add(new Car(3, "Hyundai", "i20"));

			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

			String jsonArray = objectMapper.writeValueAsString(carList);

			System.out.println(jsonArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
