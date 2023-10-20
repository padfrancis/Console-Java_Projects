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
public class Three_Dim_ArrayAct_Francis_Padron 
{
   public static void main(String args[])
   { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of tables: ");
    System.out.print("> ");
    int table = input.nextInt();
    System.out.println("Enter number of rows: ");
    System.out.print("> ");
    int row = input.nextInt();
    System.out.println("Enter number of columns: ");
    System.out.print("> ");
    int cols = input.nextInt();
    
    int[][][] arr = new int[table][row][cols];
    
    for (int a = 0; a < arr.length; a++) 
    {
      for (int b = 0; b < arr[a].length; b++) 
      {
        for (int c = 0; c < arr[a][b].length; c++) 
        {
          System.out.print("Index [" + a + "] [" + b + "] [" + c + "] : ");
          arr[a][b][c] = input.nextInt();
        }
      }
    }
    System.out.print("Original arrangement of your array is: ");
    for(int[][] TwoDim : arr) 
    {
      for (int[] OneDim : TwoDim) 
      {
        for (int i = 0; i < OneDim.length; i++) 
        {
          System.out.print(OneDim[i] + " ");
        }
      }
    }
    System.out.println();
    System.out.print("The Sorted Value of Your Array is: ");
    for(int[][] Arr1 : arr)
    {
      for(int[]Arr2 : Arr1)
      {
        for(int q = 0; q < Arr2.length; q++) 
        {
          for(int[][] Arr3 : arr) 
          {
            for(int [] Arr4 : Arr3) 
            {
              for(int r = 0; r < Arr4.length; r++)
               {
                if(Arr2[q] < Arr4[r]) 
                {
                  int sort = Arr2[q];
                  Arr2[q] = Arr4[r];
                  Arr4[r] = sort;
                }
              }
            }
          }
        }
      }
    }
    for(int[][] Out : arr) 
    {
      for (int[] Inner : Out) 
      {
        for (int f = 0; f < Inner.length; f++) 
        {
          System.out.print(Inner[f] + " ");
        }
      }
    }
    System.out.println();
  }
}

