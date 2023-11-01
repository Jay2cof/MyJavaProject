package OOP.Polymorphism;
// polymorphism is a concept of class method to be implemented in a diff form
// Types of polymorphism are
// method overloading and method overriding

public class Transportation {
    private int costOfTrip;
    private String typesOfTransport;
    private String meansOfTransport;

    //creating the constructors
    public Transportation( int costOfTrip, String typesOfTransport, String meansOfTransport){
        this.costOfTrip = costOfTrip;
        this.typesOfTransport = typesOfTransport;
        this.meansOfTransport = meansOfTransport;

    }

    /*
    Method overloading - Same method with the name but behaving differently
    Method overloading is also known as compile time polymorphism or static polym
    Laws of Method overloading
     - Number of parameters
     - order of data types of parameters
*/
    public void people(){
        System.out.println("class of people");
    }

    public void trip(int hours){
        System.out.println("the trip to berlin by bus is " + hours );
    }
    public void passengers(){
        System.out.println("They are carry different amount of passengers");
    }
    public void passengers(int diff_speed, int numOfPassenger){
        System.out.println(diff_speed + numOfPassenger);
    }
    public int passengers(int  number_of_wheels, double number_revenue){ // /what are mine expecting when i use return, so method overloading is created at the parent class while overriding is at the child class
        return number_of_wheels;
    }

    //creating the getters and setters
    public int getCostOfTrip(){
        return costOfTrip= costOfTrip;

    }
    public void setCostOfTrip(){
        this.costOfTrip=costOfTrip;

    }
    public String getTypesOfTransport(){
        return typesOfTransport= typesOfTransport;
    }
    public void setTypesOfTransport(){
        this.typesOfTransport= typesOfTransport;

    }
    public String getMeansOfTransport(){
        return meansOfTransport= meansOfTransport;
    }
    public void setMeansOfTransport(){
        this.meansOfTransport= meansOfTransport;
    }


}
