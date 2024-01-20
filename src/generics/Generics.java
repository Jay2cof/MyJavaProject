package generics;

public class Generics <T>{
    /* Generics class enables us to specify the type of object to be created
       alphabets that make up a generics, for uniformity reason

       T - Type (Integer, String, Long, Boolean etc)
       E - Element (Collections of object e.g arrayList, Set, Map etc)
       K - Key (Maps)
       V - Value (Maps)
       N - Number (Integers, double, long)
     */

    T name;
    T phoneNumber;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(T phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

