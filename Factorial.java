
package Arrays;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.print("Enter the amount of numbers you would want to store: ");
        int var = fact.nextInt();
        System.out.println();
        int st[] = new int[var];
        
        for (int a = 0; var > a; a++) {
            System.out.print("Input Num " + (a+1) + ": ");
            st[a] = fact.nextInt();
            System.out.println();
        }
        System.out.println("The numbers you have inputted and its corresponding factorial numbers are: ");
        for (int q = 0; var > q; q++) {
            int comp = st[q];
            int prod = 1;
            for (int f = 1; comp >= f; f++) {
            prod *= f;
            }
            System.out.println(comp + "! = " + prod);
        }
        System.out.println();
    }
}


