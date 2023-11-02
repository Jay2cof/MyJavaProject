package OOP.Abstraction;

/*Abstraction has to do with data  hiding
the two ways of providing abstraction in java is Abstract and interface
An Abstract can have abstract and non-abstract method
We cannot instantiate an abstract class i.e we cannot create an object of abstract class
We can extend an abstract class
 */

public abstract class Electronics {
    public String Brand;
    public String functions;
    public int price;


    /*public Electronics(String brand, String functions, int price) {
        Brand = brand;
        this.functions = functions;
        this.price = price;
    }

     */





    public abstract void wireless(String earphones); // An abstract method is a method without a body.

    public abstract void warranty(int years);

    public void functions(String uses){ // non-abstract method with a body.
        System.out.println("what are the functions of " + uses);
    }
    public void size(String sizes){
        System.out.println("Electronics comes in different " + sizes);
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
