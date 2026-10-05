import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentScores = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            double score = sc.nextDouble();
            sc.nextLine(); // clear buffer

            studentNames.add(name);
            studentScores.add(score);
        }

        // Calculate average, highest and lowest
        double total = 0;
        double highest = studentScores.get(0);
        double lowest = studentScores.get(0);

        String highestStudent = studentNames.get(0);
        String lowestStudent = studentNames.get(0);

        for (int i = 0; i < n; i++) {

            double score = studentScores.get(i);

            total = total + score;

            if (score > highest) {
                highest = score;
                highestStudent = studentNames.get(i);
            }

            if (score < lowest) {
                lowest = score;
                lowestStudent = studentNames.get(i);
            }
        }

        double average = total / n;

        // Display summary report
        System.out.println("\n================================");
        System.out.println("       STUDENT GRADE REPORT");
        System.out.println("================================");

        for (int i = 0; i < n; i++) {
            System.out.println(
                (i + 1) + ". " +
                studentNames.get(i) +
                " - Score: " +
                studentScores.get(i)
            );
        }

        System.out.println("--------------------------------");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest +
                           " (" + highestStudent + ")");
        System.out.println("Lowest Score  : " + lowest +
                           " (" + lowestStudent + ")");
        System.out.println("================================");

        sc.close();
    }
}