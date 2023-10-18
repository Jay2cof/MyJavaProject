package AdminApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminApp {
    public static void main(String[] args) {

        // Array of Objects
        Scanner input = new Scanner(System.in);

        Admin worker1 = new Admin("Ben", 1265, 34);
        Admin worker2 = new Admin("Charly", 2412, 12);
        Admin worker3 = new Admin("Noo", 1012, 11);

        Admin allWorkers []= new Admin[3];
        //worker.setName("Ben Somko");
        allWorkers[0] = worker1;
        allWorkers[1] = worker2;
        allWorkers[2] = worker3;

        for (int i=0; i<allWorkers.length; i++){
            System.out.println(allWorkers[i].getName());
        }

        for (int i=0; i<allWorkers.length; i++){
            System.out.println(allWorkers[i].getAge());
        }

        for (int i=0; i<allWorkers.length; i++){
            System.out.println(allWorkers[i].getPin());
        }

        //using the advance for loop

        for (Admin myWorkers: allWorkers){
            System.out.println(myWorkers.getPin());
        }

        for (Admin myWorkers: allWorkers){
            System.out.println(myWorkers.getName());
        }

        // ArrayList is just like any other Array but is mutable

        ArrayList<String> allNames = new ArrayList();
        allNames.add("Beck");
        allNames.add(0, "jayboy");
        allNames.add("Feedable");

        System.out.println(allNames);

        allNames.remove("Feedable");
        System.out.println(allNames);

        // looping though an Arraylist..this singles out the ame individually

        for(String workersName: allNames){
            System.out.println(workersName);
        }
        // Or
        for(int i=0; i<allNames.size(); i++){  // diff btw ++i and i++? increment before the var and increment after the var
            System.out.println(allNames.get(i));
        }

        ArrayList<Admin> allNamesOfWorkers= new ArrayList();

        allNamesOfWorkers.add(worker2);
        allNamesOfWorkers.add(worker1);
        allNamesOfWorkers.add(worker3);
        System.out.println();
        //showAllWorkers(allNamesOfWorkers);

        while(true){
            System.out.println("Enter 1 to view all workers: ");
            System.out.println("Enter 2 to add a workers: ");
            System.out.println("Enter 3 to remove a worker: ");
            System.out.println("Enter 4 to search for new workers: ");
            System.out.print("Enter target: ");

            int target = input.nextInt();

            if ( target == 1){
               showAllWorkers(allNamesOfWorkers);
            }

            else if (target == 2) {
                System.out.println("Workers Name: ");
                String name = input.next();

                System.out.println("Workers Pin: ");
                int pin = input.nextInt();

                System.out.println("Workers Age");
                int Age = input.nextInt();

                allNamesOfWorkers.add(new Admin(name, pin, Age));
                System.out.println("An Admin has being added");



                }

            else if (target == 3){
                System.out.println("Workers name: ");
                String name = input.next();

                System.out.println("Workers Pin: ");
                int pin = input.nextInt();

                System.out.println("Workers Age: ");
                int Age = input.nextInt();

                allNamesOfWorkers.remove(new Admin(name, pin, Age));
                System.out.println("An Admin has being removed ");


            }

            /*else if (target == 4){
                System.out.println("Worker name: ");
                int pin = input.nextInt();

                allNamesOfWorkers.get(new Admin(pin));
            }

             */

        }

        /*  Type  Variable   collection
        for(Admin workers: allNamesOfWorkers){
            System.out.println("Name :" + workers.getName());
            System.out.println("Pin :" + workers.getPin());
            System.out.println("Age :" + workers.getAge());
            System.out.println();
        }

         */
    }
    // you can not create another method inside a method, but you can still call the method from another method

    public static void showAllWorkers(ArrayList<Admin>allNamesOfWorker){

        for(Admin workers: allNamesOfWorker){
            System.out.println("Name :" + workers.getName());
            System.out.println("Pin :" + workers.getPin());
            System.out.println("Age :" + workers.getAge());
            System.out.println();
        }
    }


}
