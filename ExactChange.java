import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an amount in dollars and cents: $");
        double amt = scan.nextDouble();
        amt *= 100;
 
        int q = (int) (amt / 25);
        amt -= q * 25;

        int d = (int) (amt / 10);

        amt -= d * 10;

        int n = (int) (amt / 5);
        amt -= n * 5;

        int p = (int) (amt / 1);
        amt -= p * 1;

        System.out.println(q + " quarters");
        System.out.println(d + " dimes");
        System.out.println(n + " nickels");
        System.out.println(p + " pennies");
        
    }
}
