package OOP;

public class FlightDetails {

    String name;
    int noOfPasengers;
    String takeOff;
    String destination;
    int time;

    int prize;

    public void LufthansaDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("NoOfPasengers: " + this.noOfPasengers);
        System.out.println("TakeOff: " + takeOff);
        System.out.println("Destination: " + destination);
        System.out.println("Time: " + time);
        System.out.println("Prize: " + prize);
        System.out.println();


    }

    public void details(String bags, int quantity){
            System.out.println("Traveling Packages " + bags +" " + quantity);
        }

    public double FlightDuration(int TotalNoHours){
        int HoursperTrip = TotalNoHours * 2;
        double Total = HoursperTrip/2;
        return Total;
        }



}

