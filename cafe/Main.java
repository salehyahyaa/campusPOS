package cafe;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu menu = new Menu(); //bringing the menu file and evrythin in it into this main
        String menuOption = "";

        do {
            menu.displayMenu(); //menu class has a displayMenu function
            System.out.println("\nPlease make selection: ");
            menuOption = sc.nextLine();
            Product item = menu.getMenuItem(menuOption);
            if (item == null) {
                System.out.println("\nYour selection is invaild"); 
            }
            else {
                System.out.println(String.format("\nYou selected: ", args));
            }
        
        } while (!menuOption.equals("end"));
    }
}