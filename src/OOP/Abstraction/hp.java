package OOP.Abstraction;

public class hp implements GeneralElectronic{
    @Override
    public void functions(int binary, String read_emails) {
        System.out.println("the computer is usually used to "+ read_emails);
    }


    @Override
    public String playMusic(String different_Songs) {
        return "DJ use the computer for play "+ different_Songs;
    }
    // A class that implements of an interface must provide the implementation of all the methods of the interface must be declared abstract
}
