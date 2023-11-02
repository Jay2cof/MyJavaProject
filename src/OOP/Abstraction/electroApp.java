package OOP.Abstraction;

import java.util.Scanner;

public class electroApp {
    public static void main(String[] args) {

        Scanner electro = new Scanner(System.in);

         Electronics electronics = new Television();
         electronics.wireless("Samsung");
         electronics.warranty(5);



        /*Electronics electronics1 = new Television("JayTV", "watching news", 200);
        System.out.println(electronics1.getBrand());
        System.out.println(electronics1.getFunctions());
        System.out.println(electronics1.getPrice());

         */



    }
}
