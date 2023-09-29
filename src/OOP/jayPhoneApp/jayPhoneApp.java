package OOP.jayPhoneApp;

public class jayPhoneApp {
    public static void main(String[] args) {

        phone jayPhone = new phone(150.23, 15, "Jaygold", "The Jaygold phone is Mostly to be used by Software developers","welcome to the new world of digitization");
        //jayPhone.setPrize(150.23);
        System.out.println(jayPhone.getPrize());

        //jayPhone.setMessage("welcome to the new world of digitization");
        System.out.println(jayPhone.getMessage());

        //jayPhone.setName("Jaygold");
        System.out.println(jayPhone.getName());

        //jayPhone.setSize(15);
        System.out.println(jayPhone.getSize());

        //jayPhone.setTargetPeople("The Jaygold phone is Mostly to be used by Software developer");
        System.out.println(jayPhone.getTargetPeople());

        System.out.println(jayPhone.getYearlyProduction());


    }
}
