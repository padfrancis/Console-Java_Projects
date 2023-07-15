import java.util.Scanner;
import java.util.ArrayList;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        double grade = 0;
        String response;

        do {
            System.out.print("Enter a grade (or 'done' to finish): ");
            response = input.next();

            if (!response.equals("done")) {
                grade = Double.parseDouble(response);

                if (grade <= 100) {
                    grades.add(grade);
                } else {
                    System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                }
            }
        } while (!response.equals("done"));

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        double average = sum / grades.size();

        System.out.printf("Average grade: %.2f\n", average);
        if (average >= 90) {
            System.out.println("Excellent!");
        } else if (average >= 80) {
            System.out.println("Good job!");
        } else if (average >= 70) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("You need to work harder.");
        }
    }
}
