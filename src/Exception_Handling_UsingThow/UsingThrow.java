package Exception_Handling_UsingThow;
// using throw to create a problem

public class UsingThrow {
    //Using the static keyword

    public static void main(String[] args) {
       try {

            checkNameExit("ju");
        }
        catch(ClassCastException J){
        //    System.out.println("Please login with the right names");
            J.printStackTrace();
        }

       try{
           throw new CustomException(1234567890l, "Passenger can fly");
       }
       catch(CustomException d){
           System.out.println("Get the security operative involved");
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
        if (IdName.equalsIgnoreCase("Miko")){
            System.out.println("the id name belongs to mike");
        }
        else{
            throw new RuntimeException("Only mike is allowed to login in this account");
        }

    }
    public static void checkDetails(String details)throws CustomException{
        if(details.equalsIgnoreCase("Passenger can fly")){
        }
        else{
            throw new CustomException(1234567890, "the details must match");
        }
    }
}
