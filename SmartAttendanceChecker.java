import java.util.Scanner;

public class SmartAttendanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage =
                (double) attendedClasses / totalClasses * 100;

        System.out.println("Attendance Percentage: "
                + attendancePercentage + "%");

        if (attendancePercentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}