/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;
import java.util.*;
/**
 *
 * @author HP
 */
public class ShoppingCalculator 
{
    public static void main (String [] args) 
    {
        Scanner main = new Scanner (System.in);
        System.out.println("Enter the number of groceries you want to compute.");
        System.out.print("> ");
        int size = main.nextInt();
        String [][]arr = new String[size][1];
        if (size > 2) 
        {
            System.out.println("Enter the grocery Item and its price:");
            for (int i = 0; i < arr.length; i++) 
            {
                for (int j = 0; j < arr[i].length; j++) 
                {
                    System.out.print("");
                    arr[i][j] = main.nextLine();
                }
            }
            System.out.println("Grocery Items:\tPrice");
            for (int k = 0; k < arr.length; k++) 
            {
                for (int l = 0; l < arr[k].length; l++) 
                {
                    System.out.print(arr[k][l]);
                }
                System.out.print("\t");
            }
        }
        else 
        {
            System.out.println("Please Enter more grocery items to calculate\n");
            main(args);
        }
        
    }
    public static void lowestPrice () 
    {
        
    }
    public static void computeSubtotal () 
    {
        
    }
    public static void computeVAT () 
    {
        
    }
    public static void computeTotalDue () 
    {
        
    }
 }
