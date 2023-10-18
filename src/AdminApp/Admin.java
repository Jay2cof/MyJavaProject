package AdminApp;

public class Admin {

    private String name;

    private double pin;

    private int age;

    private final String governmentWorker = "Teacher";

    public Admin(String name, double pin, int age) {
        this.name = name;
        this.pin = pin;
        this.age = age;
    }

    public Admin() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPin() {

        return pin;
    }

    public void setPin(double pin) {
        this.pin = pin;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override  // another diamention to ponomo.....is a menthod that has being before
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", pin=" + pin +
                ", age=" + age +
                ", governmentWorker='" + governmentWorker + '\'' +
                '}';

    }
}
