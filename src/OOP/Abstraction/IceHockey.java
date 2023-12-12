package OOP.Abstraction;

public class IceHockey extends Sports implements WinterSports{
    public IceHockey(String winners, String losers, int scores) {
        super(winners, losers, scores);
    }

    @Override
    public void Location() {
        System.out.println("in snow countries");
    }

    @Override
    public void Dangerous() {
        System.out.println("the level of cold or snow,can also make it dangerous");

    }

    @Override
    public void Ski() {
        System.out.println("its also an individual and team work");

    }
}
