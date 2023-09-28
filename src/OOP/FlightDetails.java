package OOP;

public class FlightDetails {

    String name;
    int noOfPasengers;
    String takeOff;
    String destination;
    int time;

    int prize;

    // Constructor is always using the class name, and is always Public
    // Constructor Overloading is having more than one constructor in a class
    // There are three main constructors
    // Default - is automatically at the background by JVN
    // No argument constructor when you have no  parameters()
    // With argument construction when you have paraments in ()


    public FlightDetails(){
        //no arguement Const
    }

    public FlightDetails(String justice, int time, int noOfPasengers){
        this.name = justice;
        this.time = time;
        this.noOfPasengers = noOfPasengers;

    };

    public void LufthansaDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("NoOfPasengers: " + this.noOfPasengers);
        System.out.println("TakeOff: " + takeOff);
        System.out.println("Destination: " + destination);
        System.out.println("Time: " + time);
        System.out.println("Prize: " + prize);
        System.out.println();


    }

    public void details(String bags, int quantity) {
        System.out.println("Traveling Packages " + bags + " " + quantity);
    }

    public double FlightDuration(int TotalNoHours) {
        int HoursperTrip = TotalNoHours * 2;
        double Total = HoursperTrip / 2;
        return Total;
    }

    public String SelectPlane(int BaggageSize) {
        String CheckIn = null;
        if (BaggageSize<23 && BaggageSize>16) {
            CheckIn = "Your trip is 100 percent taken care of";
        } else {
            CheckIn = "You are responsible for your trip";

        }

        return CheckIn;
    }

}




