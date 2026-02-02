// Convert a Java object (Car) into JSON format.

package com.jsonhandling.carjson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Car car = new Car("Toyota", "Fortuner", 2022, 4200000);
			String json = objectMapper.writeValueAsString(car);
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
