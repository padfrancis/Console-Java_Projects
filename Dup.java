/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.Scanner;
public class Dup {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        int st;
        String[] val;
        boolean same;

        System.out.print("Enter the number of words to store: ");
        st = words.nextInt();
        words.nextLine();
        
        val = new String[st];
        
        for (int i = 0; i < st; i++) {
            do {
                same = false;
                System.out.print("Enter word #" + (i + 1) + ": ");
                val[i] = words.nextLine();
                
                for (int j = 0; j < i; j++) {
                    if (val[j].equalsIgnoreCase(val[i])) {
                        System.out.println("Please don't enter the same word.");
                        same = true;
                        break;
                    }
                }
            }while(same);
        }
        System.out.println("Words you have entered are:");
        for(int i = 0; i < st; i++) {
            System.out.println("Word " + (i+1) + " : " + val[i]);
        }
    }
}
