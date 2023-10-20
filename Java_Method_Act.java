package Methods;
import java.util.*;
public class Java_Method_Act 
{
    public static void main (String [] args) 
    {
        Scanner input = new Scanner (System.in);
        printMenu();
        int res = input.nextInt();
        Selection(res);
        Rerun(res);
    }
    public static void printMenu() 
    {
        System.out.println("-------------------------------Choose a program to run-------------------------------");
        System.out.println("Type 1 for a program that calculates the area of a circle");
        System.out.println("Type 2 for a program that calculates the sum of all integers up to a given number");
        System.out.println("Type 3 for a program that converts a temperature from Celcius to Farenheit");
        System.out.println("--------------------------------Program by: Francis---------------------------------\n");
        System.out.println("Please enter a number to pick a program");
        System.out.print("> ");
    }
    public static double GetRad(double rad) 
    {
        return Math.PI * rad * rad;
    }
    public static int addNum (int k) 
    {
        int add = 0;
        for (int i = 0; i <= k; i++) 
        {
            add += i;
        }
        return add;
    }
    public static double ConvertTemp(double temp) 
    {
        return (temp* 9/5) + 32;
    }
    public static void Selection(int res) 
    {
        System.out.println();
        Scanner get = new Scanner(System.in);
        switch (res) 
        {
            case 1:
                System.out.println("Enter the Radius of the Circle");
                System.out.print("> ");
                double rad = get.nextDouble();
                double area = GetRad(rad);
                System.out.printf("The area of the Circle is: %.2f\n",area);
                break;
            case 2:
                System.out.println("Enter an integer");
                System.out.print("> ");
                int num = get.nextInt();
                int sum = addNum(num);
                System.out.println("The sum of all integers you entered is up to " + num + " is " + sum + ".");
                break;
            case 3:
                System.out.println("Enter a temperature in Celcius");
                System.out.print("> ");
                double celc = get.nextDouble();
                double F = ConvertTemp(celc);
                System.out.println("The Temperature you entered has been converted from " + celc + "C to " + F + "F.");
                break;
            default:
                System.out.println("Error please try again! ");
                main(new String [] {});
                break;
        }
    }
    public static int Rerun(int re) 
    {
        Scanner get = new Scanner(System.in);
        System.out.println("Would you like to try again? (1 for Yes & 0 for No)");
        System.out.print("> ");
        re = get.nextInt();
        if (re == 1) 
        {
            main(new String [] {});
        }
        else 
        {
            System.out.println("Program Finished.");
        }
        return re;
    }
}