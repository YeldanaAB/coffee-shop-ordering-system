import java.util.ArrayList;

public class Order {
    // stores beverages in this order
    private ArrayList<Beverage> items = new ArrayList<>();
    private String customer;
    
    // constructor to create a new order
    public Order(String customer) { 
        this.customer = customer; 
    }
    
    // adds a beverage to the order
    public void add(Beverage b) { 
        items.add(b); 
    }
    
    // prints a receipt showing the total
    public void printReceipt() {
        double total = 0;
        System.out.println("\n=== Order For " + customer + " ===");
        for(Beverage b : items) {
            System.out.println(b);
            System.out.println("   " + b.getIngredients());
            total += b.getPrice();
        }
        System.out.printf("TOTAL: $%.2f\n=====================\n", total);
    }
    
    // returns number of items in the order.
    public int getCount() { 
        return items.size(); 
    }
}