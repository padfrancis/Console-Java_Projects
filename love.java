
package Loops;
import java.util.Scanner;
public class love {
    public static void main(String[] args) {
        Scanner forbidden = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Word: ");
             String val = forbidden.nextLine();
             if (val.equals("love")) {
                 System.out.println("The Forbidden Word has been said!");
                 break;
                }
            }
        System.out.println("You have prevented yourself from saying the Forbidden word! Great Job!");
        }
    }

