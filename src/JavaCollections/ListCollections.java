package JavaCollections;

import java.util.ArrayList;

public class ListCollections {

    public static void main(String[] args) {
        // List is an order collection. list can contain duplicate elements
        //The classes that implements the list interface are Arraylist, LinkedList, Stack, Vector

        ArrayList<String> climate = new ArrayList<>();
        //Populating an Arraylist

        climate.add("Germany");
        climate.add(1, "Cold");
        climate.add("Nigeria");
        //climate.add(33, "warm"); //the problem opf exception occurs because of a number higher than 3
        climate.add(0, "warm");


        climate.add("Nigeria");
        climate.add("Germany");
        climate.add("China");

        //Looping through an ArrayList
        for(String cold: climate){
            System.out.println(cold);
        }
        //Removing elements from an arraylist
        climate.remove(0);
        climate.remove("Nigeria");
        climate.add("Canada");


        System.out.println(climate);



        try{
            climateWarming(33);
        }
        catch(IndexOutOfBoundsException c) {
            System.out.println("the temp is correct");
        }

        try {
            climate.add(33, "warm");// solving the issues

            System.out.println(climate);
        }
        catch(IndexOutOfBoundsException d){
            System.out.println("the number doesn't matter");

        }

    }

    public static void climateWarming(int temp){
        if (temp == 33) {
            System.out.println("the number is correct");
        } else {
            throw new IndexOutOfBoundsException("the number is fine");
        }
    }

}
