import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        double marks = sc.nextDouble();

        String grade = (marks >= 80) ? "A / A+" :
                (marks >= 75) ? "A-" :
                (marks >= 70) ? "B+" :
                (marks >= 65) ? "B" :
                (marks >= 60) ? "B-" :
                (marks >= 55) ? "C+" :
                (marks >= 50) ? "C" :
                (marks >= 45) ? "C-" :
                (marks >= 40) ? "D" :
                "F";

        double gradePoint = (marks >= 80) ? 4.00 :
                (marks >= 75) ? 3.67 :
                (marks >= 70) ? 3.33 :
                (marks >= 65) ? 3.00 :
                (marks >= 60) ? 2.67 :
                (marks >= 55) ? 2.33 :
                (marks >= 50) ? 2.00 :
                (marks >= 45) ? 1.67 :
                (marks >= 40) ? 1.00 :
                0.00;

        String status = (marks >= 80) ? "Excellent / Distinction" :
                (marks >= 70) ? "Credit / Very Good" :
                (marks >= 60) ? "Good" :
                (marks >= 55) ? "Satisfactory Pass" :
                (marks >= 50) ? "Minimum Pass" :
                (marks >= 45) ? "Conditional Pass / Fail" :
                (marks >= 40) ? "Fail" :
                "Absolute Fail";

        System.out.println("\nGrade: " + grade);
        System.out.println("Grade Point: " + gradePoint);
        System.out.println("Performance Status: " + status);

        sc.close();
    }
}