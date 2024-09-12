import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");

        System.out.print("Please enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Please enter the second integer: ");
        int num2 = scan.nextInt();
        System.out.print("Please enter the third integer: ");
        int num3 = scan.nextInt();

        double avg = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg);
    }
}