import java.util.Scanner;

public class NewActivities {
    public static void main(String[] args) {
        Scanner ShoppingList = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Buying 3 items from shops");

        System.out.println("How  many books were bought: ");
        int num = input.nextInt();

        System.out.println("What items were bought: ");
        String items = ShoppingList.nextLine();

        if (num <= 3 && items.equalsIgnoreCase("books")) {
            System.out.println("Select Books: kids books, adult books, audio books");
        }
        String bookType = ShoppingList.nextLine();
        if (bookType.equalsIgnoreCase("kids books")) {
            System.out.println("Yes book belong to this list");
        } else if (bookType.equalsIgnoreCase("audio books")) {
            System.out.println("Yes book belong to this list");
        } else {
            System.out.println("does not belong to the list");
        }


    }
}