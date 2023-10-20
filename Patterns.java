/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.*;
/**
 *
 * @author HP
 */
public class Patterns 
{
    public static void main(String [] args) 
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square pattern: ");
        int size = input.nextInt();

        char[][][] pattern = new char[size][size][size];

        // Create hollow square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    pattern[1][i][j] = '*';
                } else {
                    pattern[1][i][j] = ' ';
                }
            }
        }

        //System.out.println("Hollow square pattern:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[1][i][j] + " ");
            }
            System.out.println();
        }
    }
}
