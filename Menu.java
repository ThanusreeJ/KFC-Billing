import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private static final Map<String, Integer> menu = new HashMap<>();
    static {
        menu.put("Chicken65", 100);
        menu.put("Chicken Wings", 150);
        menu.put("Chicken Biryani", 300);
        menu.put("Chicken Lollipop", 150);
        menu.put("Chicken Legpiece", 100);
        menu.put("Thumsup", 50);
        menu.put("Coke", 50);
        menu.put("Chicken Fry", 250);
        menu.put("Chicken Burger", 180);
        menu.put("Chicken Rice", 350);
        menu.put("Chicken Curry", 200);
        menu.put("Chicken Softrice", 150);
        menu.put("French fries", 150);
        menu.put("Spicy Hotwings", 200);
    }

    public static void displayMenu() {
        System.out.println("MENU:");
        menu.forEach((item, price) -> System.out.println(item + " - " + price + "/-"));
        Order.takeOrder(menu);
    }
}