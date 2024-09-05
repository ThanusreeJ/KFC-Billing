import java.util.Scanner;

public class Rating {
    public static void askForRating() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please rate our service (1-5):");
        int rating = sc.nextInt();
        
        switch (rating) {
            case 5:
                System.out.println("Thank you for the excellent rating!");
                break;
            case 4:
                System.out.println("Thank you! We'll strive to improve.");
                break;
            case 3:
                System.out.println("Thank you! We'll work on getting better.");
                break;
            case 2:
                System.out.println("We apologize for any inconvenience. We'll work on improving.");
                break;
            case 1:
                System.out.println("We're sorry to hear that! We will improve.");
                break;
            default:
                System.out.println("Invalid rating! Please rate between 1 and 5.");
                askForRating();
                return;
        }
        
        System.out.println("Thank you for your visit! Please come again.");
    }
}