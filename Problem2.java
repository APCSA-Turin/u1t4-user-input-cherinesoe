import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1, enter your name: ");
        String p1 = scan.nextLine();
        System.out.print("Enter your number: ");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Player 2, enter your name: ");
        String p2 = scan.nextLine();
        System.out.print("Enter your number: ");
        double num2 = scan.nextDouble();
        scan.nextLine();
        
        if (num1 > num2) {
            System.out.println(p1 + "'s number is bigger!");
        } else if (num2 > num1) {
            System.out.println(p2 + "'s number is bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
