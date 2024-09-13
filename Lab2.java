import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter a number: ");
        double num1 = scan.nextDouble();
        scan.nextLine();
        result += num1;

        if (num1 < 5) {
            result ++;
        } else {
            result --;
        }

        System.out.print("Enter another number: ");
        double num2 = scan.nextDouble();
        scan.nextLine();
        result -= num2;

        System.out.print("Enter another number: ");
        double num3 = scan.nextDouble();
        scan.nextLine();
        result *= num3;

        System.out.print("Enter another number: ");
        double num4 = scan.nextDouble();
        scan.nextLine();
        result /= num4;

        System.out.print("Enter another number: ");
        double num5 = scan.nextDouble();
        scan.nextLine();
        result %= num5;

        System.out.println(name + "'s final result is: " + result);

    }
}