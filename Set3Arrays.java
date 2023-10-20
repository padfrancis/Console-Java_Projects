/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Set3Arrays {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("How many integers would you want to input: ");
        int kamusta = array.nextInt();
        System.out.println("===================================================\n");
        
        int pay[] = new int[kamusta];
        for (int ex = 0; ex < kamusta; ex++) {
            System.out.println("===================================================");
            System.out.print("Input Integer " + (ex+1) + ": ");
            pay[ex] = array.nextInt();
        } 
        System.out.println("===================================================\n");
        for (int exe = 0; exe < kamusta; exe++) {
            int jo = pay[exe];
            int mahal = 1;
            for (int n = 1; n <= jo; n++) {
                mahal *= n;
            }
            System.out.println(jo + "! = " + mahal);
        }
        System.out.println();
        if(kamusta <=1) {
        System.out.println("The Integer Number that you have entered and its corresponding factorial value is printed above");
        }else {
        System.out.println("The Integer Numbers that you have entered and its corresponding factorial values are printed above");
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nProgram by: Padron, Francis Benedict O.");
    }
}


