public abstract class Beverage {

    
    private String name;
    private String size;
    private boolean isIced;
    private int orderNum;
    private static int total = 0;


    /**
     * constructor for a new beverage
     * @param name name of the drink (Latte, Green Tea, etc.)
     * @param size small, medium, or large
     * @param isIced true if iced, false if not
     */

    public Beverage(String name, String size, boolean isIced){
        this.name = name;
        this.size = size;
        this.isIced = isIced;
        total += 1;
        this.orderNum = total;
    }

    // calculates price based on drink type, size, and extras.
    public abstract double getPrice(); 


    // returns a string listing all ingredients in the drink
    public abstract String getIngredients();


    // gets drinks name
    public String getName(){
        return name;
    }

    // gets size of drink: small, medium or large.
    public String getSize(){
        return size;
    }

    // says if drink is iced or not. true = iced, false = not iced.
    public boolean isIced(){
        return isIced;
    }

    // returns the total number of drinks created across all orders.
    public static int getTotal() {
        return total;
    }

    // returns string of the drink ex. Iced Medium Latte, $4.50
    @Override
    public String toString(){
        String i = "";
        if(isIced){
            i = "Iced ";
        }
        return String.format("%s%s %s, $%.2f", i, size, name, getPrice());
    }

    // compares different orders with their order number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Beverage other = (Beverage) obj;
        return this.orderNum == other.orderNum;
    }

}
