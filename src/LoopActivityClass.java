import java.util.Scanner;

public class LoopActivityClass {
    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);

        int BirthDetails = 2;

        while (true){
            System.out.println("enter your date of birth");
            String date = details.nextLine();

            if (BirthDetails == 1){
                System.out.println("Please try again after 2 hours");
            }

            if(date.equalsIgnoreCase("12-12-90")){
                System.out.println("correct details");
                break;
            }
            else{
                BirthDetails -= 1;
                System.out.println("wrong details");
                System.out.println(" trail left " + BirthDetails + " left");
                break;
            }

        }
    }
}
