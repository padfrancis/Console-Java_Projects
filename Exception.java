import java.util.Scanner;
public class Exception extends Throwable {
    public static Scanner in = new Scanner(System.in);
    public static int num1;
    public static int num2;
    public static int result;
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.print("First Number: ");
            num1 = in.nextInt();

            System.out.print("Second Number: ");
            num2 = in.nextInt();
            try
            {
                validateNumbers(num1, num2);
                break;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
        result = num1 * num2;
        System.out.println("Result: " + result);
    }
    private static void validateNumbers(int firstNumber, int secondNumber)
    {
        if (firstNumber < 0 && secondNumber < 0)
        {
            throw new IllegalArgumentException("Both numbers should not be negative.");
        }
        else if (firstNumber < 0)
        {
            throw new IllegalArgumentException("First number should not be negative.");
        }
        else if (secondNumber < 0)
        {
            throw new IllegalArgumentException("Second number should not be negative.");
        }
        else if (firstNumber == 0)
        {
            throw new IllegalArgumentException("First number should not be zero.");
        }
        else if (secondNumber == 0)
        {
            throw new IllegalArgumentException("Second number should not be zero.");
        }
        else if ((firstNumber == 0)  && (secondNumber == 0))
        {
            throw new IllegalArgumentException("Both numbers should not be zero.");
        }
    }
}
