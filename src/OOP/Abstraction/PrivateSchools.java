package OOP.Abstraction;

public class PrivateSchools extends School {
    @Override
    public void salary() {
        int pay = getTeachers();
        setTeachers(pay += 5000);
        System.out.println(getTeachers());
    }

    @Override
    public void bonus() {

    }
}
