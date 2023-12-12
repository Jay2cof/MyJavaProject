package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    /*something that triggers your computer to crush
    types
    1. Checked exception
    2. Unchecked exception
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int a = input.nextInt();
            System.out.println("Enter another number: ");
            int c = input.nextInt();

            System.out.println(a / c);

        }

        catch (ArithmeticException ar) {

            System.out.println("cannot divide by zero");

        }
        catch (InputMismatchException f){
            System.out.println(" Please input number needed ");

        }
        catch(Exception w){
            System.out.println(" There is something missing");
        }
        finally {
            System.out.println("anything will be executed here, even if exception occurs or not");
        }



    }
}