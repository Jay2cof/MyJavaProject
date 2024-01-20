package oop.Abstraction;

public class PublicSchool extends School{

    @Override
    public void salary() {
        int pay = getTeachers();
        setTeachers(pay += 1000);
        System.out.println(getTeachers());
    }

    @Override
    public void bonus() {
        int increasePay = getTeachers();
        setTeachers(increasePay += 100);
        System.out.println(getTeachers());
    }
}
