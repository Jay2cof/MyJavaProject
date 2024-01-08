package JavaCollections;

import java.util.HashSet;

public class Hashset {
    //Set does not store data in form of int.
    // Set does not maintain insertion order
    // does not accept duplicate order
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet<>();
        cars.add("Benz");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Benz");
        cars.add("Mazda");
        cars.add("benz");

        System.out.println(cars);
        System.out.println();

        cars.remove("Mazda");
        cars.add("Corolla");

        for(String motor: cars){
            System.out.println(motor);

        }

        /*System.out.println(cars);

        cars.remove("Mazda");

        for(String motor: cars);{
            System.out.println(motor);
        }

        */

    }
}
