public class VariableActivities {
    public static void main(String[] args) {
        // how much is the TotalCost to build a 3 rooms duplex

        double TotalCostOfMaterials, Labour, TransportingOfMaterials, costOfLand;
        TotalCostOfMaterials = 6000;
        Labour = 4000;
        TransportingOfMaterials = 300;
        costOfLand = 5000;
        double TotalCost1 = TotalCostOfMaterials + Labour + TransportingOfMaterials + costOfLand;

        System.out.println("the totalcost to build 3 room duplex is " + TotalCost1 + " Naira");

        // using float

        float TotalCostOfMaterial, Labour1, Transport, CostOfLands;
        TotalCostOfMaterial = 6000;
        Labour1 = 4000;
        Transport = 300;
        CostOfLands = 5000;
        float TotalCost2 = TotalCostOfMaterial + Labour1 + Transport + CostOfLands;

        System.out.println("cost of building is " + TotalCost2 + " Naira");

        // shopping list for Fred's Birthday
        // how can a give var a number e.g juice 10 packs, wine 50 bottles etc

        double juice, wine, beer, cake, newShoe, rice, chips, friedChicken;
        double packOfJuice = 2.05;
        juice = packOfJuice * 18;
        wine = 200;
        beer = 300;
        cake = 500;
        newShoe = 2000;
        rice = 200;
        chips = 300;
        friedChicken = 100;
        double drinks = juice + wine + beer;
        double food = rice + chips + friedChicken;
        double TotalcostOfShoppingList = cake + newShoe + drinks + food;

        // System.out.println("fred's birthday party will cost " + TotalcostOfShoppingList + " euro");

        wine = 490;
        System.out.println("additional price of wine " + wine + " euro");
        newShoe = 1000;
        System.out.println("reduction price of shoe " + newShoe + " euro");


        TotalcostOfShoppingList = cake + newShoe + drinks + food;

        // how to update all details to the new price

        System.out.println("new total price for the party " + TotalcostOfShoppingList + " euro");


        // total number of functioning computers in my company
        double dell, macbook, Hp, Futitsu, samsung, damageComputers;
        dell = 13;
        macbook = 20;
        Hp = 100;
        Futitsu = 25;
        samsung = 10;
        damageComputers = 56;
        double TotalGoodComputers = dell + macbook + Hp + Futitsu + samsung;
        double TotalFunctioningComputers = TotalGoodComputers - damageComputers;

        System.out.println("The number of functioning computers is " + TotalFunctioningComputers);



    }
}
