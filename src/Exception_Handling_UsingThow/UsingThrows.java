package Exception_Handling_UsingThow;

// use Throws when you are check exception, and its throw at the beginning of an exception
// Throws are used to create and solve new exceptions

import java.io.IOException;

public class UsingThrows {
    public static void main(String[] args) throws ClassCastException, IOException{ // still functions without the throws

        checkPassportNumber(1223);

        try{
            checkName("Justice Onu");
        }
        catch(IOException r){
            System.out.println(" Traveling with the correct name");
        }
    }
    public static void checkPassportNumber(int Num) throws ClassCastException{
        if (Num == 1223){
            System.out.println("allowed to continue trip");
        }
        /*else{
            throw new ClassCastException("call the cops");
            //System.out.println("call the police");
        }

         */
    }
    public static void checkName(String realName)throws IOException{
        if(realName.equalsIgnoreCase("Justice Onu")){

        }

    }
}
