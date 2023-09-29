package OOP.jayPhoneApp;
// this is Encapsulation, which means data hiding using the access spicifier
public class phone {
    private double prize;
    private String message;
    private int size;
    private String targetPeople;
    private String name;
    private final int yearlyProduction = 1000;
    private String priceStatus;

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

    public void setTargetPeople(String targetPeople){
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

    public int getYearlyProduction(){
        return this.yearlyProduction;
    }

    public String getPriceStatus(){
        return this.priceStatus;
    }

    public phone(double prize, int size, String name,String targetPeople, String message){
        this.prize = prize;
        this.size = size;
        this.name = name;
        this.targetPeople = targetPeople;
        this.message = message;

        if (prize == 150.23){
            this.priceStatus = "This price is accurate";

        }

        else if (prize > 150.23 ){
            this.priceStatus ="This price does not match our company policy";

        }

        else{
            this.priceStatus = "This price does not match our company policy";
        }
    }






}


