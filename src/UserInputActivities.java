import java.util.Scanner;

public class UserInputActivities {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter any number: ");
        double firstNumber = numbers.nextDouble();

        System.out.println("Enter any digits: ");
        double FirstDigits = numbers.nextDouble();

        double totalFigures = firstNumber + FirstDigits;
        System.out.println("Total: " + totalFigures);


        // Calculate monthly Salary
        // Housing allowance = 50%
        // Health Benefit = 20%
        // Tax = 30% of the basic Salary
        // Transportation allowance =15%

        System.out.println("Enter Monthly Salary: ");
        double monthlySalary = numbers.nextDouble();

        System.out.println("Enter the Housing Allowance: ");
        double housingAllowance = numbers.nextDouble();

        double netSalary = monthlySalary + housingAllowance;
        System.out.println("netSalary " + netSalary);



        /*double housingAllowance1 = monthlySalary + 50/100;
        double healthBenefit = monthlySalary + 20/100;
        double tax = monthlySalary - 20/100;
        double transport = monthlySalary + 15/100;

        double netSalary = housingAllowance1 + healthBenefit +transport - tax;
        System.out.println("your net salary is: " + netSalary + "$");

         */











    }
}
// what happens when i start coding from here....