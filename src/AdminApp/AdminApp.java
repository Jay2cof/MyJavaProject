package AdminApp;

import java.util.ArrayList;

public class AdminApp {
    public static void main(String[] args) {

        // Array of Objects
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

        for(String workersName: allNames){
            System.out.println(workersName);
        }

    }


}
