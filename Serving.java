import java.util.Scanner;

public class Serving {
    public static void serveFood() {
        System.out.println("Choose the counter (1, 2, or 3):");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        switch (counter) {
            case 1:
                counterService("COUNTER 1");
                break;
            case 2:
                counterService("COUNTER 2");
                break;
            case 3:
                counterService("COUNTER 3");
                break;
            default:
                System.out.println("Invalid counter selected. Please try again.");
                serveFood();
        }
    }

    private static void counterService(String counter) {
        System.out.println(counter);
        System.out.println("Your Amount is Received");
        System.out.println("Your Item is Ready. Please take your Item.");
        System.out.println("Thank you for Ordering! Please Visit Again.");
        Bill.generateBill();
    }
}
