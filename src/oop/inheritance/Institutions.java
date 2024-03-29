package oop.inheritance;

public class Institutions {

//Inheritance is the concept of extending all the feature to another class(subclass)
/*  Types of inheritance
    Single level
    Multilevel
    Hierarchical
 */

    private String name;
    private String head;
    private int numbers;
    private int networth;
    private String address;

    // The Super keyword is used to make referance to the super class(Institution class)


    public Institutions(String name, String head, int numbers, int networth, String address) {
        this.name = name;
        this.head = head;
        this.numbers = numbers;
        this.networth = networth;
        this.address = address;
    }
    public Institutions(){

    }

    public void Meetings(String BoardMeeting){
        System.out.println("Type of Meeting: " + BoardMeeting);

    }

    public void uniqueNames(String NameOfOrganisation){
        System.out.println("Names of Organisation: " + NameOfOrganisation);

    }

    public void staffs(String PositionsOfEmployers){
        System.out.println("Job Positions: " + PositionsOfEmployers);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void populations(int numbersOfMembers){
        System.out.println("Population of Members: " + numbersOfMembers);



    }

}
