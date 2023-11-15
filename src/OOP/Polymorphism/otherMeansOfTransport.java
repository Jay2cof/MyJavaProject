package OOP.Polymorphism;

public class otherMeansOfTransport extends Transportation {

    private String space;
    private int price;


    public otherMeansOfTransport(int costOfTrip, String typesOfTransport, String meansOfTransport, String space, int price) {
        super(costOfTrip, typesOfTransport, meansOfTransport);

        this.space = space;
        this.price = price;
    }
    //Method overriding when the child class provides another implementation of a method that has created in the parent class
    // Override is used to provide a diff implementation of a method in the child class
    // Method overriding is also called runtime or dynamic polymorphism

    @Override // Also called Annotation is a short for some hidden program.
    public void people() { //the method name, return type and parameter must match when doing method overriding.
        System.out.println("Different factors plays when people decide what type of Transport to travel with");
    }

    @Override
    public void trip(int hours) {
        System.out.println("the trip to berlin by plane is " + hours);
    }
}