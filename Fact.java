import java.util.*;
public class Fact
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is = " + fact);
    }
}