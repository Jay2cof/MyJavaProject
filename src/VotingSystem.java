import java.util.Scanner;
import java.util.concurrent.Callable;

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

public class VotingSystem {
    public static void main(String[] args) {
        Scanner voting = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Vote wisely for a better Country ");

        System.out.println("Enter your Sex : ");
        String sex = voting.nextLine();

        System.out.println(" Enter your Age : ");
        int age = input.nextInt();

        System.out.println("Enter your Nationality : ");
        String nationality = voting.nextLine();

        if (age >= 18 && (sex.equalsIgnoreCase("male ") || sex.equalsIgnoreCase("female")) & nationality.equalsIgnoreCase("Nigeria")) {
            System.out.println("Select your Party : APC, PDP, LP ");


            String CandidateParty = voting.nextLine();
            if (CandidateParty.equalsIgnoreCase("LP")) {
                System.out.println("you voted for LP ");
                System.out.println("Please enter Candidate name: ");

                String CandidateName = voting.nextLine();
                if(CandidateName.equalsIgnoreCase("Justice")) {
                    System.out.println("You Selected " + CandidateName + "Thank you for voting ");
                }

                }
            else if  (CandidateParty.equalsIgnoreCase("PDP ")){
                    System.out.println("You voted for PDP ");
                    System.out.println("Please enter Candidate name: ");

                    String CandidateName = voting.nextLine();
                    if(CandidateName.equalsIgnoreCase("Leona")){
                        System.out.println("you for voted for " + CandidateName + "Thanks you for voting ");
                    }
                }


            else if (CandidateParty.equalsIgnoreCase("APC")) {
                System.out.println("you voted for APC");
                System.out.println("Please enter Candidate name: ");

                String CandidateName = voting.nextLine();
                if (CandidateName.equalsIgnoreCase("Mike")) {
                    System.out.println(" You Selected " + CandidateName + " Thank you for voting ");

                }
                else {
                    System.out.println("you voted for the wrong Candidate");
                }
            }


                else {
                    System.out.println("This party does not exist!! ");
                }

            }

        else {
                System.out.println("not ready to vote");
            }

        }

    }