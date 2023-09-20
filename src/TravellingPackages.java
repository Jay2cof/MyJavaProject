import java.util.Scanner;

public class TravellingPackages {
    public static void main(String[] args) {
        Scanner PackageList = new Scanner(System.in);

        System.out.println("List of Packages Available");

        StringBuilder Packages = new StringBuilder(); // can this be placed anywhere.

        while (true){
            System.out.println("Add Package list or enter stop to quit ");
            String list = PackageList.nextLine();
            Packages.append(list + "\n");

            if(list.equalsIgnoreCase("stop")){
              System.out.println(Packages);

                break;
            }
        }

    }
}
