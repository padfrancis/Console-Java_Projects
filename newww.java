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
public class newww {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
        
        // Prompt user to enter the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        
        // Create a two-dimensional array of the specified size
        int arr[][] = new int[rows][cols];
        
        // Prompt user to enter the elements of the array
        System.out.println();
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Enter value of array [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        
        //Display all the elements of the Array
        System.out.print("The original value of your array is: ");
        for(int [] Arrays : arr) 
        {
            for(int i = 0; i < Arrays.length; i++) 
            {
                System.out.print(Arrays[i] + " ");
            }
        }
        
        //Display the sorted value of your array
        System.out.println();
        System.out.print("The sorted order of your array is: ");
        for (int [] Sort : arr) 
        {
            for (int p = 0; p < Sort.length; p++) 
            {
                System.out.print(Sort[p] + " ");
            }
        }
    }
}

