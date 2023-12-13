package Exception_Handling_UsingThow;

public class UsingThrow {
    //Using the static keyword

    public static void main(String[] args) {
        try {

            checkNameExit("jay");
        }
        catch(ClassCastException J){
            System.out.println("Please login with the right names");
        }

        try{
            checkIdNumber("Mi");
        }
        catch(RuntimeException R){
            System.out.println("login with the right details");
        }


    }
    public static void checkNameExit(String name){
        if (name.equalsIgnoreCase("justice")){
            System.out.println("you are welcome to our national portal ");
        }
        else{
            throw new ClassCastException("please login with the correct name");
        }

    }
    public static void checkIdNumber(String IdName){
        if (IdName.equalsIgnoreCase("Miko")){//why number not allowed
            System.out.println("the id name belongs to mike");
        }
        else{
            throw new RuntimeException("Only mike is allowed to login in this account");
        }

    }
}
