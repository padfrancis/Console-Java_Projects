package Arrays;
import java.util.*;
public class TwoD_Arrays_Act_Francis_Padron 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows is your array? ");
        System.out.print("> ");
        int row = input.nextInt();
        System.out.println("How many columns is your array? ");
        System.out.print("> ");
        int cols = input.nextInt();
        System.out.println();
        int [][] arr = new int[row][cols];
        
        for (int i = 0; i < arr.length; i++) 
        {
            for (int b = 0; b < arr[i].length; b++) 
            {
                System.out.print("Index [" + i + "] [" + b + "] : ");
                arr[i][b] = input.nextInt();
            }
        }
        System.out.print("\nThe original order of your array is: ");
        for (int[] array : arr) 
        {
            for (int m = 0; m < array.length; m++) 
            {
                System.out.print(array[m] + " ");
            }
        } 
        System.out.println(); 
        System.out.print("The sorted value of your array is: ");

        for (int[] arr1 : arr) 
        {
            for (int j = 0; j < arr1.length; j++) 
            {
                for (int[] arr2 : arr) 
                {
                    for (int l = 0; l < arr2.length; l++) 
                    {
                        if (arr1[j] < arr2[l]) 
                        {
                            int sort = arr1[j];
                            arr1[j] = arr2[l];
                            arr2[l] = sort;
                        }
                    }
                }
            }
        }
        for (int[] arr3 : arr) 
        {
            for (int j = 0; j < arr3.length; j++) 
            {
                System.out.print(arr3[j] + " ");
            }
        }
        System.out.println();
    }
}
