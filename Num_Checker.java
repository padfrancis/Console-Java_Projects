import java.util.Scanner;

public class Num_Checker
{
    public static Scanner in = new Scanner(System.in);
    public static int num;
    public static boolean numChecker = false;
    public static void main (String [] args)
    {
        System.out.print("Enter a number: ");
        num = in.nextInt();
        numChecker = Checker(num);
        if (numChecker)
        {
            System.out.println(num + " IS AN EVEN NUMBER.");
        }
        else
        {
            System.out.println(num + " IS AN ODD NUMBER.");
        }
    }
    public static boolean Checker (int num)
    {
        return num % 2 == 0;
    }
}
