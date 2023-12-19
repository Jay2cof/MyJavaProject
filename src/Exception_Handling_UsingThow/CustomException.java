package Exception_Handling_UsingThow;
// the base class for every exception class is the Exception

public class CustomException extends Exception {
    // creating a constructor for CustomException

    int phoneNumber;
    String textMessage;

   /* @Override
    public String toString() {
        return "CustomException{" +
                "phoneNumber=" + phoneNumber +
                ", textMessage='" + textMessage + '\'' +
                '}';
    }

    */

    CustomException (int phoneNumber, String textMessage){
        this.phoneNumber = phoneNumber;
        this.textMessage = textMessage;

    }
    public String toSting(){ //why error when boolean is used
        return "1234567890" + phoneNumber;
    }

    public String toString(){ //what is toString and why use it
        return "the details must match" + textMessage;
    }




}
