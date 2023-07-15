import java.util.*;
public class less
{
    static Scanner in = new Scanner(System.in);
    static int number, num;
    public static void main (String [] args)
    {
        String num1 = "8";
        int num2 = 8;
        int i = Integer.parseInt(num1);
        if (num2 == i) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
    static void Divide ()
    {
        if (number <= 9999)
        {
            if (number % 5 == 0)
            {
                System.out.printf("%d is divisible by 5\n", num);
                main(new String[]{});

            }
            else
            {
                System.out.printf("%d is not divisible by 5\n" , num);
                main(new String[]{});
            }
        }
        else
        {
            System.out.println("Error! You have reached the limit!");
            main(new String[]{});
        }
    }
    static int getNum ()
    {
        System.out.print("Enter a Number: ");
        number = in.nextInt();
        return number;
    }
}
