import java.util.Random;
import java.util.Scanner;

public class VotingMachineSystem {
    public static void main(String[] args) {
        Scanner TownHallVoters = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);

        System.out.println(" Welcome to BonnyIsland Towns Voting, Please vote wisely ");

        System.out.println(" What are the total numbers of voters: ");
        int registrationNumber = Input.nextInt();

        System.out.println(" Are you a member? : ");
        String realVoters = TownHallVoters.nextLine();

        System.out.println(" Date of registration: ");
        int date = Input.nextInt();

        if (registrationNumber <= 200 && (date >= 1980 && date <= 2000) && realVoters.equalsIgnoreCase("yes")) {

            System.out.println("Enter your registration Number: ");
            int realMemberNumber = Input.nextInt();

            System.out.println(" Enter Candidate name: ");
            String nameCandidate = TownHallVoters.nextLine();

            if (realMemberNumber == 266 && nameCandidate.equalsIgnoreCase("Mr Mike")) {
                System.out.println(" Congratulation you have voted");

            } else {
                System.out.println(" Wrong details ");
            }
        }
    }
}

/*
Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed

 */