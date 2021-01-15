import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner in = new Scanner(System.in);
        
        System.out.println( "Enter the latitude of the starting location:");
        double startLatitude = in.nextDouble();
        System.out.println( "Enter the longitude of the starting location:");
        double startLongitude = in.nextDouble();
        System.out.println("Enter the latitude of the ending location:");
        double endLatitude = in.nextDouble();
        System.out.println("Enter the longitude of the ending location:");
        double endLongitude = in.nextDouble();

        GeoLocation myGeo1 = new GeoLocation(startLatitude, startLongitude);
        GeoLocation myGeo2 = new GeoLocation(endLatitude, endLongitude);

        double distance = myGeo1.distanceFrom(myGeo2);
        System.out.println("Distance: " + distance);


    }
}