import java.util.Scanner;

public class Tip {
    public static void askForTip(int totalAmount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to give us a tip? (yes or no):");
        String response = sc.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Please enter the tip amount:");
            int tipAmount = sc.nextInt();
            totalAmount += tipAmount;
            System.out.println("Thank you for the " + tipAmount + "/- tip!");
        } else {
            System.out.println("No problem! Thank you for your order.");
        }
        Bill.finalizeBill(totalAmount);
    }
}