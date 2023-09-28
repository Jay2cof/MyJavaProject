package OOP.jayPhoneApp;
// this is Encapsulation, which means data hiding using the access spicifier
public class phone {
    private double prize;
    private String message;
    private int size;
    private String targetPeople;
    private String name;
    private final int yearlyProduction = 1000;

    // in Encapsulation you have one means of setting the values of the fields of your class setters
    // another means is the geting the values of your fields is getters

    public void setPrize(double prize){
        this.prize = prize;
    }

    public double getPrize(){
        return this.prize;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public void setTargetPeople(String setTargetPeople){
        this.targetPeople = targetPeople;

    }

    public String getTargetPeople(){
        return this.targetPeople;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    /*public phone(double prize, int size, String name){
        this.prize = prize;
        this.size = size;
        this.name = name;

        if (prize == 150.23 && prize > 150.23 ){

        }
    }

     */




}


