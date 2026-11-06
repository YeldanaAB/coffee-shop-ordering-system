import java.util.ArrayList; 

public class Coffee extends Beverage implements Customizable {
    private String milkType;
    private int shots;

    // to store customizations
    private ArrayList<String> customizations = new ArrayList<>();


    // constructor for coffee
    public Coffee(String name, String size, boolean isIced, String milkType, int shots){
        super(name, size, isIced);
        this.milkType = milkType;
        this.shots = shots;
    }

    // constructor overloading to have whole milk as the default
    public Coffee(String name, String size, boolean isIced, int shots){
        this(name, size, isIced, "Whole", shots);  
    }

    // returns type of milk used
    public String getMilkType(){return milkType;}


    // returns number of espresso shots
    public int getShots(){return shots;}

    // says what caffeine level based on amount of espresso shots
    public String getCaffeineLevel(){
        if(shots >= 3) return "High";
        if(shots == 2) return "Medium";
        return "Low";
    }

    // adds customizations like extra shots or milk changes
    @Override
    public void customize(String item) {
        if(item.equals("extra shot")) {
            shots += 1;
            customizations.add("Extra shot");
        }
        if(item.equals("oat milk")) {
            milkType = "Oat";
            customizations.add("Oat milk");
        }
        if(item.equals("almond milk")) {
            milkType = "Almond";
            customizations.add("Almond milk");
        }
        if(item.equals("soy milk")) {
            milkType = "Soy";
            customizations.add("Soy milk");
        }
    }

    
    // returns list of all customizations made
    @Override
    public String getCustomizations() {
        if(customizations.isEmpty()) return "None";
        return String.join(", ", customizations);
    }

    // calculates final price based on size, shots and type of milk.
    @Override
    public double getPrice(){
        double price = 3.30;
        if(getSize().equals("Large")) price += 1.0;
        if(getSize().equals("Small")) price -= 0.80;
        if(shots > 2) price += (shots-2) * 1.25;
        if(milkType.equals("Oat") || milkType.equals("Almond") || milkType.equals("Soy")) {
            price += 0.80;
        }
        return price;
    }

    // returns what ingredients were used in the making of the drink
    @Override
    public String getIngredients() {
        return shots + " shots, " + milkType + " milk";
    }
}