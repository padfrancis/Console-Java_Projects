/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Francis Padron
 */
import java.util.Scanner;
public class LabAct1_Francis_Padron 
{
    public static void main (String []args) 
    {     
Scanner getdia = new Scanner(System.in);
        
        System.out.println("Enter Diameter:"); 
        double dia = getdia.nextDouble(); 
        
        double Pi = 3.1416; 
        double rad = dia / 2; 
        double calc1 = Pi * rad * rad;
       
        System.out.printf("Radius = %.2f\n " , rad);
        System.out.printf("The area of the circle is: %.2f\n", calc1);
  
    }
}
