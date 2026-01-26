package com.travellog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TripSerializer {

	// Write list of trips to file
	public void writeTrips(String fileName, List<Trip> trips) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Write each trip object to file
		for (int i = 0; i < trips.size(); i++) {
			oos.writeObject(trips.get(i));
		}

		oos.close();
		fos.close();
	}

	// Read trips from file into a list
	public List<Trip> readTrips(String fileName) throws IOException, ClassNotFoundException {
		List<Trip> trips = new ArrayList<>();
		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("Trip file not found: " + fileName);
			return trips;
		}

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Read until end of file
		try {
			while (true) {
				Trip trip = (Trip) ois.readObject();
				trips.add(trip);
			}
		} catch (EOFException e) {
			// End of file reached
		}

		ois.close();
		fis.close();

		return trips;
	}
}
