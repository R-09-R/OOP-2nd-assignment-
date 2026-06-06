import java.util.Scanner;

public class LogicalOperatorsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        boolean result = (num3 == (num1 + num2));

        if (result) {
            System.out.println("The third number is the sum of the first two numbers.");
        } else {
            System.out.println("The third number is NOT the sum of the first two numbers.");
        }
        sc.close();
    }
}