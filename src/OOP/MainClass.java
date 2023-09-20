package OOP;

public class MainClass {
    public static void main(String[] args) { // void automatically creates
        // an object is an instance of a class
        // a class is a blueprint of an object

        // creating an object
        // create by using the className(Human)

        Human firstHuman = new Human();// The states/Fields or method of a class are bound to the object.
        firstHuman.email = "jay@workhard.com";
        firstHuman.name = "justice";
        firstHuman.status = "married";
        firstHuman.age = 45;
        firstHuman.height = 1.73;

        System.out.println(firstHuman.age);
        System.out.println(firstHuman.email);
        System.out.println(firstHuman.status);
        System.out.println(firstHuman.height);
        System.out.println(firstHuman.name);
        firstHuman.eat("rice");

        System.out.println();

        Human secondHuman = new Human();
        secondHuman.age = 23;
        secondHuman.height = 1.88;
        secondHuman.name = "lEONA";

        System.out.println(secondHuman.age);
        System.out.println(secondHuman.height);
        System.out.println(secondHuman.name);
        secondHuman.eat("yam");




    }
}
