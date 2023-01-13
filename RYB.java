/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERMPROJECT;
import java.util.Scanner;
/**
 *
 * @author Francis Padron
 */
public class RYB {
    public static void main(String [] args) {
        Scanner color = new Scanner (System.in);
        
        //Types of colors
        String type, primary, secondary1, secondary2, tertiary1, tertiary2;
        
            System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
            System.out.println("                         RYB COLOR WHEEL PROGRAM                     ");
            System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
            System.out.println("         Choose a type of color: Primary, Secondary, or Tertiary      ");
            System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
            System.out.print("Your Choice: ");
            type = color.nextLine();
            System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
            
            
         if(type.equals("Primary") || type.equals("primary")){
             System.out.println("                  Select a Color: Red, Yellow or Blue");
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
             System.out.print("Your Choice: ");
             primary = color.nextLine();
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
             
        //Primary Colors
        String Red, Yellow, Blue;
             
             {
                 if(primary.equals("Red") || primary.equals("red")){
                     System.out.println("                     Enter the format of the Color");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("                           (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Red = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Red
        String Hr = "FE2712";
        String rgbr = "(254, 39, 18)";
        String hslr = "(5, 99%, 53%)";
                     
                     {
                         switch (Red) {
                             case "HEX":
                             case "hex":
                                 System.out.println("HEX color format for Red: #" + Hr );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Red: rgb" + rgbr);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Red: hsl" + hslr);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(primary.equals("Yellow") || primary.equals("yellow")) {
                     System.out.println("                     Enter the format of the Color");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("                           (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Yellow = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Yellow
        String Hy = "FEFE33";
        String rgby = "(254, 254, 52)";
        String hsly = "(60, 99%, 60%)";
                     
                     {
                             switch (Yellow) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Yellow: #" + Hy );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Yellow: rgb" + rgby);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Yellow: hsl" + hsly);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                  }
               }
            }else if(primary.equals("Blue") || primary.equals("blue")){
                     System.out.println("                     Enter the format of the Color");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("                           (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Blue = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Blue
        String Hb = "0247FE";
        String rgbb = "(2, 71, 254)";
        String hslb = "(224, 99%, 50%)";
        
                     {
                         switch (Blue){
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Blue: #" + Hb);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Blue: rgb " + rgbb);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Blue: hsl" + hslb);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                       }    
                    }
                 }else{
                System.out.println("Invalid Input! Please try Again!");
                main(args);
               }
             }
           }else if(type.equals("Secondary") || type.equals("secondary")){
             System.out.println("Primary Colors Available: (Red, Yellow, Blue)");
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
             System.out.print("Select a First Primary Color: ");
             secondary1 = color.nextLine();
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
             System.out.print("Select a Second Primary Color: ");
             secondary2 = color.nextLine();
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
             
         //Secondary Colors
        String Orange, Green, Purple;
        
             {
                 if(secondary1.equals("Red") && secondary2.equals("Yellow") || secondary1.equals("Yellow") && secondary2.equals("Red")) {
                     System.out.println("The two Primary Colors have been combined and it is turned into Orange!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Orange = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
        //HEX, RGB, HSl Color Format for Orange
        String Ho = "FB9902";
        String rgbo = "(251, 153, 2)";
        String hslo = "(36, 98%, 50%)";
        
                     {
                         switch (Orange) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Orange: #" + Ho );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "rgb":
                             case "RGB":
                                 System.out.println("RGB color format for Orange: rgb" + rgbo);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "hsl":
                             case "HSL":
                                 System.out.println("HSL color format for Orange: hsl" + hslo);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(secondary1.equals("Blue") && secondary2.equals("Yellow") || secondary1.equals("Yellow") && secondary2.equals("Blue")) {
                     System.out.println("The two Primary Colors have been combined and it is turned into Green!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Green = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Green
        String Hg = "66B032";
        String rgbg = "(102, 176, 50)";
        String hslg = "(95, 56%, 44%)";
        
                     {
                         switch (Green) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Green: #" + Hg );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Green: rgb" + rgbg);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Green: hsl" + hslg);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                      }
                    }
                 }else if(secondary1.equals("Blue") && secondary2.equals("Red") || secondary1.equals("Red") && secondary2.equals("Blue")) {
                     System.out.println("The two Primary Colors have been combined and it is turned into Purple!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     Purple = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Purple
        String Hp = "8601AF";
        String rgbp = "(134, 1, 175)";
        String hslp = "(286, 99%, 35%)";
        
                     {
                         switch (Purple) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Purple: #" + Hp );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Purple: rgb" + rgbp);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Purple: hsl" + hslp);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                       }
                     }else if(secondary1.equals("Red") && secondary2.equals("Red")){
                     System.out.println("Try again! You cannot mix the same Colors!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else if(secondary1.equals("Yellow") && secondary2.equals("Yellow")){
                     System.out.println("Try again! You cannot mix the same Colors!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else if(secondary1.equals("Blue") && secondary2.equals("Blue")){
                     System.out.println("Try again! You cannot mix the same Colors!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else{
                     System.out.println("Invalid Input! Please Try again!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }
             }
             
           }else if(type.equals("Tertiary") || type.equals("tertiary")) {
             System.out.println("Select a  Primary Color: Red, Yellow or Blue");
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
             System.out.print("Your Choice: ");
             tertiary1 = color.nextLine();
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
             System.out.println("Select a Secondary Color: Orange, Green or Violet");
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
             System.out.print("Your Choice: ");
             tertiary2 = color.nextLine();
             System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
             
        //Tertiary Colors
        String RedO, RedP, YellowO, YellowG, BlueG, BlueP;
        
             {
                 if(tertiary1.equals("Red") && tertiary2.equals("Orange")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Red-Orange!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     RedO = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Red-Orange
        String Hro = "FC600A";
        String rgbro = "(252, 96, 10)";
        String hslro = "(21, 98%, 51%)";
        
                     {
                 switch (RedO) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Red-Orange: #" + Hro );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Red-Orange: rgb" + rgbro);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Red-Orange: hsl" + hslro);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                      }
                   }
                 }else if(tertiary1.equals("Red") && tertiary2.equals("Violet")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Red-Violet!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     RedP = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
         //HEX, RGB, HSL Color Format for Red-Violet
        String Hrp = "C24160";
        String rgbrp = "(194, 20, 96)";
        String hslrp= "(334, 81%, 42%)";
        
                     {
                         switch (RedP) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Red-Violet: #" + Hrp );
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Red-Violet: rgb" + rgbrp);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Red-Violet: hsl" + hslrp);
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(tertiary1.equals("Yellow") && tertiary2.equals("Orange")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Yellow-Orange!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     YellowO = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
         //HEX, RGB, HSL Color Format for Yellow-Orange
        String Hyo = "FCCC1A";
        String rgbyo = "(252, 204, 26)";
        String hslyo = "(47, 97%, 55%)";
        
                     {
                         switch (YellowO) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Yellow-Orange: #" + Hyo );
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Yellow-Orange: rgb" + rgbyo);
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Yellow-Orange: hsl" + hslyo);
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(tertiary1.equals("Yellow") && tertiary2.equals("Green")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Yellow-Green!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     YellowG = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Yellow-Green
        String Hyg = "B2D732";
        String rgbyg = "(178, 215, 50)";
        String hslyg = "(73, 67%, 52%)";
        
                     {
                         switch (YellowG) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Yellow-Green: #" + Hyg );
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Yellow-Green: rgb" + rgbyg);
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Yellow-Green: hsl" + hslyg);
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(tertiary1.equals("Blue") && tertiary2.equals("Green")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Blue-Green!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     BlueG = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
        
        //HEX, RGB, HSL Color Format for Blue-Green
        String Hbg = "347C98";
        String rgbbg = "(52, 124, 152)";
        String hslbg = "(197, 49%, 40%)";
        
                     {
                         switch (BlueG) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Blue-Green: #" + Hbg );
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Blue-Green: rgb" + rgbbg);
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Blue-Green: hsl" + hslbg);
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(tertiary1.equals("Blue") && tertiary2.equals("Violet")) {
                     System.out.println("The Primary and Secondary Colors you have chosen has turned into: Blue-Violet!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.println("Enter the format of the Color: (HEX, RGB, or HSL?)");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                     System.out.print("Your Choice: ");
                     BlueP = color.nextLine();
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     
        //HEX, RGB, HSL Color Format for Blue-Violet
        String Hbp = "4424D6";
        String rgbbv = "(68, 36, 214)";
        String hslbv = "(251, 71%, 49%)";
        
                     {
                         switch (BlueP) {
                             case "HEX":
                             case "hex":
                                 System.out.println("Hex color format for Blue-Violet: #" + Hbp );
                                 break;
                             case "RGB":
                             case "rgb":
                                 System.out.println("RGB color format for Blue-Violet: rgb" + rgbbv);
                                 break;
                             case "HSL":
                             case "hsl":
                                 System.out.println("HSL color format for Blue-Violet: hsl" + hslbv);
                                 break;
                             default:
                                 System.out.println("Invalid Color Format! Please Try Again!");
                                 System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
                                 main(args);
                                 break;
                         }
                     }
                 }else if(tertiary1.equals("Red") && tertiary2.equals("Green")) {
                     System.out.println("The primary and secondary colors are not compatible in the RYB Color Wheel.");
                     System.out.println("Please Try Again!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else if(tertiary1.equals("Yellow") && tertiary2.equals("Violet")) {
                     System.out.println("The primary and secondary colors are not compatible in the RYB Color Wheel.");
                     System.out.println("Please Try Again!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else if(tertiary1.equals("Blue") && tertiary2.equals("Orange")) {
                     System.out.println("The primary and secondary colors are not compatible in the RYB Color Wheel.");
                     System.out.println("Please Try Again!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }else{
                     System.out.println("Invalid Input! Please Try Again!");
                     System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
                     main(args);
                 }
             }
           }else{
           System.out.println("Invalid Input! Please Try Again!");
           System.out.println("+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+\n");
           main(args);
       }
    }
}
/*
Program by: Padron, Francis Benedict O.
Groupmates:
Janssen Soto
Errol Tabangen
Jecko Unciano
*/
