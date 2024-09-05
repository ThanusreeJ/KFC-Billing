import java.util.Scanner;

public class Bill {
    public static void generateBill() {
        System.out.println("Generating your bill...");
    }

    public static void finalizeBill(int totalAmount) {
        System.out.println("*****KFC*****");
        System.out.println("Your Bill");
        System.out.println("Your Total Amount:" +totalAmount + "/-");
        
        Rating.askForRating();
    }
}