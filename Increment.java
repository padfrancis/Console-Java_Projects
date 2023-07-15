import java.util.Scanner;

public class Increment {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char alph = 'x';
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++)
        {
            System.out.print("Enter an integer for " + alph + ": ");
            num[i] = in.nextInt();
            alph++;
        }

        int current = num[0];
        int increment = num[2];
        int target = num[1];


        for (int k = 0; k < num[1]; k++)
        {
            System.out.print(current);
            if (current + increment <= target) {
                System.out.print(" , ");
            } else {
                break;
            }
            current += increment;
        }
    }
}