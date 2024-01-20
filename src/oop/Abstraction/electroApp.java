package oop.Abstraction;

import java.util.Scanner;

public class electroApp {
    public static void main(String[] args) {

        Scanner electro = new Scanner(System.in);

         Electronics electronics = new Television();
         electronics.setPrice(200);
         electronics.setFunctions("for news and documentary viewer");
         electronics.wireless("Samsung");
         electronics.warranty(5);
         System.out.println(electronics.getPrice());
         System.out.println(electronics.getFunctions());

        System.out.println();



        Electronics electronics1 = new Television("JayTV", "watching news", 200);
        System.out.println(electronics1.getBrand());
        System.out.println(electronics1.getFunctions());
        System.out.println(electronics1.getPrice());

        hp hpComputers = new hp();
        hpComputers.functions(400, "all types of music");
        System.out.println(hpComputers.playMusic("depending on the events"));


    }
}
