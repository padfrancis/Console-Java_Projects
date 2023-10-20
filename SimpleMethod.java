/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author HP
 */
public class SimpleMethod
{
    private static int num;
    public static void main (String [] args) 
    {
        //initialize a number
        int num = 8; int num2 = 3;
        //transfer the two initialized numbers to the addnum method
        addnum(num , num2);
        //Print the returned value
        int add1 = addnum(num, num2);
        System.out.println(add1);
    }
    public static int addnum(int  n, int b) 
    {
        //add two numbers
        int add = n + b;
        //return the added number when the method is called
        return add;
    }
}
