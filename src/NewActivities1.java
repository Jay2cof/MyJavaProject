import java.util.Random;
import java.util.Scanner;

public class NewActivities1 {
    public static void main(String[] args) {
        Scanner LotteryJackPot = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        Random number = new Random(); // you dnt have to create any number, its done by the sys

        System.out.println("Welcome to Jay Lottery Where everyone is a winner ");

        System.out.println(" Enter your Name: ");
        String name = LotteryJackPot.nextLine();

        System.out.println(" Enter your age: ");
        int age = Input.nextInt();



        int CorrectNumber = number.nextInt(5);


        if (age >= 18 && name.equalsIgnoreCase("mike") ) {
            System.out.println(" Enter lucky number: ");
            int luckyNumber = Input.nextInt();
            if (luckyNumber == CorrectNumber) {
                System.out.println("you are a winner " + name);

            }
            else if (luckyNumber < 0 || luckyNumber > 6 && luckyNumber > 10 ) {
                System.out.println("Sorry you played a number that is out of the lucky numbers ");

            }
            else {
                System.out.println("Sorry you lost " + name );
                System.out.println(" The lucky number is " + CorrectNumber );
            }



        }
        else {
            System.out.println("Not eligible to Participate");
        }

    }
}
