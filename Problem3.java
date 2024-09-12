import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit integer: ");
        int num = scan.nextInt();
        scan.nextLine();

        int digit1 = num / 100;
        int digit2 = (num - (digit1 * 100)) / 10;
        int digit3 = num - (digit1 * 100) - (digit2 * 10);

        System.out.println("The reverse of " + num + " is : " + digit3 + digit2 + digit1);
    }
}
