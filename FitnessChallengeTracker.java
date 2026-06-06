import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nnumber of steps for day 1:");
        int day1 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 2:");
        int day2 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 3:");
        int day3 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 4:");
        int day4 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 5:");
        int day5 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 6:");
        int day6 = sc.nextInt();
        System.out.printf("Nnumber of steps for day 7:");
        int day7 = sc.nextInt();

        int totalSteps = (day1 + day2 + day3 + day4 + day5 + day6 + day7);
        System.out.println("Total Steps: " +totalSteps);

        double averageSteps = (double)totalSteps/7;
        System.out.println("Average Steps: " +averageSteps);

        int maxSteps = day1;
        maxSteps = Math.max(maxSteps, day2);
        maxSteps = Math.max(maxSteps, day3);
        maxSteps = Math.max(maxSteps, day4);
        maxSteps = Math.max(maxSteps, day5);
        maxSteps = Math.max(maxSteps, day6);

        System.out.println("Highest Steps: " +maxSteps);
        sc.close();
    }
}
