/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;
import java.util.Scanner;
/**
 *
 * @author Francis Padron
 */
public class bloodtype {
    public static void main (String[] args) {
        Scanner blood = new Scanner(System.in);
        
        String type;
        System.out.println("Blood Types Available:");
        System.out.println("O- , O+ , A- , A+ , B- , B+ , AB- , AB+");
        System.out.print("Enter recipients blood type: ");
        type = blood.nextLine();
        
        switch (type) {
            case "O-":
                System.out.print("Enter Donors Blood Type: ");
                String d1 = blood.nextLine();
                {
                    switch(d1) {
                        case "O-":
                            System.out.println(type + " and " + d1 + " blood types are compatible.");
                            break;
                        case "O+":
                            System.out.println(type + " and " + d1 + " blood types are incompatible.");
                        default:
                            System.out.println("Invalid Blood Type!");
                            break;
                    }
                }  break;
            case "O+":
                System.out.print("Enter Donors Blood Type: ");
                String d2 = blood.nextLine();
                {
            switch (d2) {
                case "O-":
                    System.out.println(type + " and " + d2 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type + " and " + d2 + " blood types are compatible.");
                    break;
                case "A-":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                case "A+":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                case "B-":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                case "B+":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                case "AB-":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                case "AB+":
                    System.out.println(type + " and " + d2 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }
                break;
            case "A-":
                System.out.print("Enter Donors Blood Type: ");
                String d3 = blood.nextLine();
                {
            switch (d3) {
                case "O-":
                    System.out.println(type +  " and " + d3 + " blood types are compatible.");
                    break;
                case "A-":
                    System.out.println(type +  " and " + d3 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break; 
                case "A+":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break;
                case "B-":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break;
                 case "B+":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break;
                 case "AB-":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break;
                 case "AB+":
                    System.out.println(type +  " and " + d3 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }   break;
            case "A+":
                System.out.print("Enter Donors Blood Type: ");
                String d4 = blood.nextLine();
                {
            switch (d4) {
                case "O-":
                    System.out.println(type +  " and " + d4 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type +  " and " + d4 + " blood types are compatible.");
                    break;
                case "A-":
                    System.out.println(type +  " and " + d4 + " blood types are compatible.");
                    break;
                case "A+":
                    System.out.println(type +  " and " + d4 + " blood types are compatible.");
                    break;
                case "B-":
                    System.out.println(type +  " and " + d4 + " blood types are incompatible.");
                    break;
                case "B+":
                    System.out.println(type +  " and " + d4 + " blood types are incompatible.");
                    break;
                case "AB-":
                    System.out.println(type +  " and " + d4 + " blood types are incompatible.");
                    break;
                case "AB+":
                    System.out.println(type +  " and " + d4 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }   break;
            case "B-":
                System.out.print("Enter Donors Blood Type: ");
                String d5 = blood.nextLine();
                {
            switch (d5) {
                case "O-":
                    System.out.println(type +  " and " + d5 + " blood types are compatible.");
                    break;
                case "B-":
                    System.out.println(type +  " and " + d5 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                case "A-":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                case "A+":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                case "B+":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                case "AB-":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                case "AB+":
                    System.out.println(type +  " and " + d5 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }       break;
            case "B+":
                System.out.print("Enter Donors Blood Type: ");
                String d6 = blood.nextLine();
                {
            switch (d6) {
                case "O-":
                    System.out.println(type +  " and " + d6 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type +  " and " + d6 + " blood types are compatible.");
                    break;
                case "B-":
                    System.out.println(type +  " and " + d6 + " blood types are compatible.");
                    break;
                case "B+":
                    System.out.println(type +  " and " + d6 + " blood types are compatible.");
                    break;
                case "A-":
                    System.out.println(type +  " and " + d6 + " blood types are incompatible.");
                    break;
                case "A+":
                    System.out.println(type +  " and " + d6 + " blood types are incompatible.");
                    break;
                case "AB-":
                    System.out.println(type +  " and " + d6 + " blood types are incompatible.");
                    break;
                case "AB+":
                    System.out.println(type +  " and " + d6 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }       break;
            case "AB-":
                System.out.print("Enter Donors Blood Type: ");
                String d7 = blood.nextLine();
                {
            switch (d7) {
                case "O-":
                    System.out.println(type +  " and " + d7 + " blood types are compatible.");
                    break;
                case "A-":
                    System.out.println(type +  " and " + d7 + " blood types are compatible.");
                    break;
                case "B-":
                    System.out.println(type +  " and " + d7 + " blood types are compatible.");
                    break;
                case "AB-":
                    System.out.println(type +  " and " + d7 + " blood types are compatible.");
                    break;
                case "O+":
                    System.out.println(type +  " and " + d7 + " blood types are incompatible.");
                    break;
                case "A+":
                    System.out.println(type +  " and " + d7 + " blood types are incompatible.");
                    break;
                case "B+":
                    System.out.println(type +  " and " + d7 + " blood types are incompatible.");
                    break;
                case "AB+":
                    System.out.println(type +  " and " + d7 + " blood types are incompatible.");
                    break;
                default:
                    System.out.println("Invalid Blood Type!");
                    break;
            }
                }       break;
            case "AB+":
                System.out.print("Enter Donors Blood Type: ");
                String d8 = blood.nextLine();
                {
                    switch (d8) {
                        case "O-":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "O+":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "A-":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "A+":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "B-":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "B+":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "AB-":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        case "AB+":
                            System.out.println(type +  " and " + d8 + " blood types are compatible.");
                            break;
                        default:
                            System.out.println("Invalid Blood Type!");
                            break;
                    }
                }       break;
            default:
                System.out.println("Invalid Input! Please try Again!");
                main(args);
                break;
          }
      }
}

/*
Salamat sa pagtitiwala hehe
*/