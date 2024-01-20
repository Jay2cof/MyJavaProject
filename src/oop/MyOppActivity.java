package oop;
 // working with Attribute
public class MyOppActivity {
    int X = 10;
    //change the value of X to 25 in Myjob2, and leave x in Myjob1 unchanged

    public static void main(String[] args) {

        MyOppActivity MyJob = new MyOppActivity();
        MyOppActivity MyJob2 = new MyOppActivity();
        MyOppActivity MyNames = new MyOppActivity();

        MyJob.X = 40; // X becomes 40
        MyJob2.X = 25;
        System.out.println(MyJob2.X);
        System.out.println(MyJob.X);

        //MyOppActivity MyNames = new MyOppActivity();

        String firstName = "Jay";
        String secondName = "Onuoha";
        int age = 66;

        System.out.println("Name: " + firstName + " " + secondName ); // worked without MyNames
        //System.out.println("Names: " + MyNames.firstName + " " + MyNames.secondName);
        //System.out.println("Age: " + MyNames.age );
    }
}
