import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner is used for input and output. this class is used for reading files and write to the file

        Scanner details = new Scanner(System.in);

        System.out.println(" 1. What is your name: ");
        String name = details.nextLine();

        System.out.println(" 2. How old are you: ");
        int age = details.nextInt();

        System.out.println(" 3. Do you Smoke: ");
        String Smoke = details.nextLine();

        System.out.println(" 4. How many stick do you Smoke per day: ");
        int HowMany = details.nextInt();

        System.out.println(" 5. Have have you had any medical complications: ");
        String hadMedicalComplication = details.nextLine();

        System.out.println(" 6. If Yes, what is it: ");
        String What = details.nextLine();

        System.out.println(" 7. do you do sports: ");
        String sports = details.nextLine();

        System.out.println(" 8. how many km do you run: ");
        double Km = details.nextDouble();


        /* System.out.println("my name is " + name);
        System.out.println("i am  " + age);
        System.out.println(" do you smoke " + Smoke);
        System.out.println(" How many do you smoke " + HowMany);
        System.out.println( " do you have any complications " + hadMedicalComplication);
        System.out.println(" if yes what" + What);
        System.out.println("do you do sports " + sports);
        System.out.println(" how many km do you run " + Km);

         */






    }
}
