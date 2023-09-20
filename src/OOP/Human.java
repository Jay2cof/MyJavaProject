package OOP;

public class Human {
    // a class is a blueprint of an Object
    // Fields, state of the class
    int age;
    String name;
    String status;
    int numberOfCars;
    String email;
    double height;

    // Behaviours/ Functionality of the class i.e methods of the class

    // How do we create method

    /*
        Access specifier(this could be private, public or protected, but starts as public by default) diff btw public,private n protected
        returns type method name (parameter list){
        body of the method

        make your return void if you are not returning any data from your method
        }
     */
    public void eat(String food){
        System.out.println("Human must eat " + food);
    }



}
