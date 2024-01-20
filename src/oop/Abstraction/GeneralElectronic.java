package oop.Abstraction;

public interface GeneralElectronic {
    /* An interface give 100% abstract
       you cannot create an instance of an interface but a class can implements an interface
       The fields of an interface aew constant
       An interface can extend multiple number of interface
     */

    String semens = "computer";

    public void functions(int binary, String read_emails);

    public String playMusic(String different_Songs);
}
