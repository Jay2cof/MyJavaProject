import java.util.Scanner;

public class ConditionsInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner opr = new Scanner(System.in);

        // the scanner is always used for interacting on the console.

        /*
        The program in the if statement will only be executed if the condition is true
        if(expression){
        action.....

        }
        else{
        action....
        }
         */

        /*program to check if a number is positive or negetive
        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number > 0){
            System.out.println(number + " is a positive number");
        }
        else {
            System.out.println(number + " is a negative number");
        }

         */



        // Login System using username and password

        String defaultUsername = "jay";
        String defaultPassword = "onu";

        System.out.println("Enter a Name ");
        String name = input.nextLine();       // Name was error why

        System.out.println("Enter email addr ");
        String email = input.nextLine();      // email was error why

        System.out.println("Enter Username");
        String Username = input.nextLine();

        System.out.println( "Enter Password");
        String Password = input.nextLine();

        if(name.equals("justice") && email.equals("jay@oal.com") && Username.equals(defaultUsername) && Password.equals(defaultPassword)){
            System.out.println("Welcome Justice"); // can use equalsIgnoreCase to ignore case sensitives variables
        }
        else {
            System.out.println("Please enter correct details");
        }

        /*Nested condition
        if(expression){
        action...
        }
        else if(expression){
        action...// why no space b4 action
        }
        else if(expression){
        action...
        }
        else{
        action...
        */




        //Grading program
        System.out.println("Enter score to determine students grade");
        int score = input.nextInt();
        if(score >= 70 && score <=100){
            System.out.println("your grade is A");
        }
        else if (score<70 && score >=60){
            System.out.println("your grade is B");
        }
        else if (score <60 && score >=50){
            System.out.println("Your grade is C");
        }
        else if (score <50 && score >=45){
            System.out.println("Your score is D");
        }
        else if (score <45 && score >=0){
            System.out.println("your score is F");
        }
        else{
            System.out.println("you have entered an invalid number, please check the number and start again");
        }




        // Create a calculator system, using number1. number2, and operators +,*,-,+

        System.out.println("Hello Jay, Please enter your first num: ");
        int firstNum = input.nextInt();

        System.out.println("Hello Sam, Please enter the second num: ");
        int SecondNum = input.nextInt();

        System.out.println("Please enter an Operator");
        System.out.println("Please only add, sub, div, multiply are allowed");
        String operator = opr.nextLine();




        // Always use nextline for string and nextint for numbers

        if (operator.equals("add")){
            System.out.println(firstNum + SecondNum);
        }
        else if (operator.equals("multiply")){
            System.out.println(firstNum * SecondNum);
        }
        
        else {
            System.out.println("Wrong operator");
        }



    }

}
