package OOP;

public class PlanesDetails {
    public static void main(String[] args) {

        FlightDetails planes= new FlightDetails();
        planes.name = "Lufthansa";
        planes.noOfPasengers = 210;
        planes.takeOff = "Frankfurt";
        planes.destination = "lagos";
        planes.time = 1130;
        planes.prize = 300;
        planes.LufthansaDetails();
        planes.details( "One baggage: ", 23);
        System.out.println();

        FlightDetails OtherPlane = new FlightDetails();
        OtherPlane.destination = "lagos";
        OtherPlane.takeOff = "frankfurt";
        OtherPlane.time = 1900;
        OtherPlane.prize = 150;
        OtherPlane.LufthansaDetails();
        OtherPlane.details("One baggage: ", 15);

        double Total = planes.FlightDuration(8);
        System.out.println(Total);

    }
}
