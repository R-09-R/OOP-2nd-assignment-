
import java.util.Scanner;
import java.time.Year;

public class AIAgePredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Your age after 10 years is " +(age+10));
        System.out.println("Your age after 25 years is " +(age+25));
        System.out.println("Your age after 50 years is " +(age+50));

        int currentYear = Year.now().getValue();
        int yearsTo100 = 100 - age;
        int yearTurn100 = currentYear + yearsTo100;

        System.out.println("You will turn 100 in the year: " +(yearTurn100));

        sc.close();
    }
}