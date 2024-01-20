package oop.Polymorphism;

public class TransportEngine {

    public static void main(String[] args) {

        Transportation Bus = new Transportation(200, "inter country", "Road");
        Bus.passengers(299, 40);
        Bus.passengers(16, 20.000);

        otherMeansOfTransport plane = new otherMeansOfTransport(175, "Big planes", "Air", "enough to carry even cars", 175);
        plane.people();
        Bus.people();
        plane.trip(4);
        Bus.trip(8);


    }
}
