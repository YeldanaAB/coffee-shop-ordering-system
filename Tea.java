import java.util.ArrayList;

public class Tea extends Beverage implements Customizable {
    private String teaType;
    private int sugar;
    private ArrayList<String> customizations = new ArrayList<>();

    //constructor for tea
    public Tea(String name, String size, boolean isIced, String teaType){
        super(name, size, isIced);
        this.teaType = teaType;
        this.sugar = 0;
    }

    // adds sugar to tea
    public void addSugar(int teaspoons) {
        sugar += teaspoons;
        customizations.add(teaspoons + " sugar");
    }

    // adds customization to tea.
    @Override
    public void customize(String item) {

        if(item.equals("sugar")) {
            sugar += 1;
            customizations.add("Sugar");
        }

        if(item.equals("honey")) {
            customizations.add("Honey");
        }

        if(item.equals("lemon")) {
            customizations.add("Lemon");
        }
    }
    
    // returns list of all customizations made to tea
    @Override
    public String getCustomizations() {
        if(customizations.isEmpty()) return "None";

        return String.join(", ", customizations);
    }


    // calculates price based on size
    @Override
    public double getPrice(){
        if(getSize().equals("Small")) return 3.00;
        if(getSize().equals("Medium")) return 3.50;

        return 4.00;
    }

    // returns ingredients in tea
    @Override
    public String getIngredients() {
        return teaType + " tea" + (sugar > 0 ? " with " + sugar + " sugar" : "");
    }
    
    // returns what type of tea it was
    public String getTeaType(){ 
        return teaType; 
    }
}