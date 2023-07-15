import java.util.Scanner;
public class Admission
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your GPA: ");
        double gpa = in.nextDouble();
        System.out.print("Enter your Admission Test Score: ");
        int score = in.nextInt();

        if (gpa >= 3.0 && gpa <= 3.9 & score >= 60 && score < 101)
        {
            System.out.println("Accept");
        }
        else if (gpa <= 0.9 || gpa >= 4.1 || score < 0 || score >= 101 )
        {
            System.out.println("Error!");
        }
        else
        {
            System.out.println("Reject");
        }
    }
}