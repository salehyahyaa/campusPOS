package cafe;
import java.math.BigDecimal;
import java.util.*;

public class Menu {
    private List<Product> items = new ArrayList<>(); //dynamicList == we can countie to add onto this non static array
    
    public Menu() { //the rule for constructors is no return arugment//even void
        BuildMenu();
    }


    private void BuildMenu() {
        Beverage beverage = new Beverage("B01", "Coffee", BigDecimal.valueOf(2.50));
        items.add(beverage); //add to the bev section within menu (since MENU is just BuildMenu) and we are able to add 3 parm's cuz of contrsucor
        
        beverage = new Beverage("B02", "Tea", BigDecimal.valueOf(3.50));
        items.add(beverage); 
    } 


    public void displayMenu() { //this class is to handle the displayingMenu portion   //void function doesnt return anything
        System.out.println("\nWelcome to CAMPUS CAFE\n");
        System.out.println("Please select from the following iteams...\n");

        for(Product item : items) {
            System.out.println(String.format("%s -- %s: $%.2f",                    //[0] == descriptionName, [1] acutal data
                    item.getId(), item.getName(), item.getBasePrice()));
        }
    }

    public Product getMenuItem(String id) {
        for(Product item : items) {
            if(item.getId().equalsIgnoreCase(id)) {
                return item;
            }
        }
        return null;
    }
}
