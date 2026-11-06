/** 
 * Name: Yeldana Bolatzhan
 * Student number: 501331154
 * 
 * Problem Description: 
 * 
 * Coffee shops are in desperate need of an ordering system made with java and I decided to address this issue by creating 
 * a coffee shop ordering system that tracks different types of beverages and categorizes them into Tea and Coffee 
 * which are the subclasses of the Beverage superclass. Each beverage has a name, size and a boolean which indicates 
 * if it is iced or not. The beverage can be customized, and the customizations are stored using an ArrayList.
 * Orders are managed through an Order class, which stores a collection of beverages using another ArrayList 
 * and calculates the total cost of the order.
 * 
 * 
 * Classes:
 * - Beverage (abstract): parent class with name, size, isIced
 * - Coffee: extends Beverage, has milk type and shots
 * - Tea: extends Beverage, has tea type and sugar
 * - Customizable (interface): customize and getCustomizations methods
 * - Order: uses ArrayList to manage drink orders 
 */

public class ProjectOneTester {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Coffee Shop Ordering System");
        
        // create some drinks
        Coffee latte = new Coffee("Latte", "Medium", false, "Oat", 2);
        Coffee espresso = new Coffee("Espresso", "Small", false, "None", 1);
        Tea greenTea = new Tea("Green Tea", "Medium", false, "Green");
        Tea chai = new Tea("Chai", "Large", true, "Black");

    
        // constructor overloading
        Coffee defaultLatte = new Coffee("Default Latte", "Large", false, 2);

        System.out.println();
        System.out.println(espresso);
        System.out.println(defaultLatte);
    
        
        // customize drinks
        latte.customize("extra shot");
        latte.customize("almond milk");
        greenTea.customize("sugar");
        greenTea.customize("honey");
        greenTea.addSugar(2);
        
        // create an order
        Order order = new Order("Jim");
        order.add(latte);
        order.add(espresso);
        order.add(greenTea);
        order.add(chai);
        
        // print receipt
        order.printReceipt();
        
        // info
        System.out.println("\n--- Drink Details ---");
        System.out.println("Latte caffeine level: " + latte.getCaffeineLevel());
        System.out.println("Latte customizations: " + latte.getCustomizations());
        System.out.println("Green tea customizations: " + greenTea.getCustomizations());
        
        // equals
        Coffee latte2 = new Coffee("Latte", "Medium", false, "Oat", 2);
        System.out.println("\n--- Equals ---");
        System.out.println("Same beverage? " + latte.equals(latte2));
        System.out.println("Same beverage? " + latte.equals(latte));
        
        // total drinks created
        System.out.println("\nTotal drinks created: " + Beverage.getTotal());
    }
}