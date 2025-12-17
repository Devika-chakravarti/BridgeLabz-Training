import java.util.*;
public class VolumeOfEarth{
    public static void main(String args[]) {

        // Radius of Earth in km
        double radius = 6378;



        // Calculating volume in cubic kilometers
        double volumeInKm = (4.0/3) * Math.PI * Math.pow(radius,3);

        // Converting volume to cubic miles (using formula 1 mile = 1.6 km)
        double volumeInMiles = volumeInKm / Math.pow(1.6, 3);



        // Displaying the volume in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
    }
}
