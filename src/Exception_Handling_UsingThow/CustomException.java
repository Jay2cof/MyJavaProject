package Exception_Handling_UsingThow;
// the base class for every exception class is the Exception

public class CustomException extends Exception {
    // creating a constructor for CustomException

    long phoneNumber;
    String textMessage;

   /* @Override
    public String toString() {
        return "CustomException{" +
                "phoneNumber=" + phoneNumber +
                ", textMessage='" + textMessage + '\'' +
                '}';
    }

    */

    CustomException (long phoneNumber, String textMessage){
        this.phoneNumber = phoneNumber;
        this.textMessage = textMessage;

    }
    public long toSting(){
        return phoneNumber;
    }

    public String toString(){
        return "the details must match" + textMessage;
    }




}
