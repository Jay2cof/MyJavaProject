package OOP.Abstraction.Interface;

public class PhoneBands {
    private String calling;
    private String Texting;
    private int cost;

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }

    public String getTexting() {
        return Texting;
    }

    public void setTexting(String texting) {
        Texting = texting;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
