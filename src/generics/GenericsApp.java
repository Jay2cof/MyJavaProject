package generics;

public class GenericsApp {
    public static void main(String[] args) {
        Generics<String>name = new Generics();
        Generics<Integer>name1 = new Generics();

        name.setName("Onuoha");
        name1.setPhoneNumber(1092839);
        System.out.println(name.getName());
        System.out.println(name1.getPhoneNumber());
        System.out.println();

        name.setName("Joe");
        name1.setPhoneNumber(1002900);
        System.out.println(name.getName());
        System.out.println(name1.getPhoneNumber());
        System.out.println();

        GenericsKeyValues<Integer, String>identity = new GenericsKeyValues();
        identity.setKeys(11105);
        identity.setValues("password");
        System.out.println(identity.getKeys());
        System.out.println(identity.getValues());


    }
}
