import java.util.Scanner;
public class Age
{
    public static void main (String [] args)
    {
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Hello " + name + " : Enter your age: ");
        age = in.nextInt();

        if (age >= 18 )
        {
            System.exit(0);
        }
        else
        {
            System.out.println(name + ", you are underage, Please try again!");
            main(args);
        }
    }
}