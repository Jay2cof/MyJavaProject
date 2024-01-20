package oop.Abstraction;

public class Television extends Electronics {

   public Television(String brand, String functions, int price) {
        super(brand, functions, price);
    }

    public Television(){

    }
    @Override
    public void wireless(String earphones){
        System.out.println("One of the best earphones is " + earphones);
    }

    @Override
    public void warranty(int years){
        System.out.println("Most Television comes with " + years + " years" + " warranty");
    }


}
