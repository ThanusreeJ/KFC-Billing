import java.util.Map;
import java.util.Scanner;

public class Order {
    public static void takeOrder(Map<String, Integer> menu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Favorite Item:");
        String food = sc.nextLine().trim();
        if (!menu.containsKey(food)) {
            System.out.println("Sorry! The item you choosed is not available. Please choose an available item.");
            takeOrder(menu);
            return;
        }
        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        int totalAmount = calculateTotalAmount(menu, food, quantity);
        System.out.println("The Total Amount is: " + totalAmount);
        
        Serving.serveFood();
        Tip.askForTip(totalAmount);
    }

    private static int calculateTotalAmount(Map<String, Integer> menu, String food, int quantity) {
        int price = menu.get(food);
        return price * quantity;
    }
}