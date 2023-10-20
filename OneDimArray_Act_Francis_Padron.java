/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.*;
/**
 * @author Francis P.
 */
public class OneDimArray_Act_Francis_Padron 
{
    public static void main (String[] args) 
    {
        int sum = 0 , val = 0 , index = 0;
        
        Scanner size = new Scanner(System.in);
        System.out.print("How many numbers would you like to store: ");
        int num = size.nextInt();
        int[] array = new int[num];
        System.out.println();
        
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print("Element " + (i+1) +":");
            array[i] = size.nextInt();
        }
        while(val < array.length) 
        {
            sum += array[val];
            val++;
        }
        System.out.println("\nThe sum of your array is: " + sum);
        
        System.out.print("\nThe original value of your array is: ");
        
        while(index < array.length) 
        {
            System.out.print(array[index] + " ");
            index++;
        }
        System.out.print("\nThe reversed order of your array is: ");
        
        for(int b = array.length - 1; b >= 0; b--) 
        {
            System.out.print(array[b] + " ");
        }
        
        for(int m = 0; m < array.length - 1; m++) 
        {
            for(int x = m + 1; x < array.length; x++) 
            {
                if (array[x] < array[m]) 
                {
                    int sort = array[x];
                    array[x] = array[m];
                    array[m] = sort;
                }
            }
        }
        System.out.print("\nSorted Value for your array is: ");
        for (int m = 0; m < array.length; m++) 
        {
            System.out.print(array[m] + " ");
        }
        System.out.println();
    }
}