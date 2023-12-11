package OOP.Abstraction;

public class Athletic implements Playing, OtherSports{
    // A class
    @Override
    public void Playing() {
        System.out.println("There are many sports in athletic");

    }

    @Override
    public void TeamWork() {
        System.out.println("Involves a lot of teamwork to win ");
    }

    @Override
    public void Location() {
        System.out.println("can be an indoor or outdoor sport");
    }

    @Override
    public void Dangerous() {
        System.out.println("may be considered as dangerous ");

    }
}

