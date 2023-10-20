package javavariables;
import java.util.Scanner;
public class JavaCalc {
    public static void main(String[]args) {
        Scanner geti = new Scanner(System.in);
        double num1, num2, ans;
        
       
        
        System.out.println("first number");
        num1 = geti.nextDouble();
        
        System.out.println("operator -,*,/,+ ");
        String ope = geti.next();
        
        System.out.print("second number");
        num2 = geti.nextDouble();
        
        switch (ope) {
        
        case "-" -> {
            ans = num1 - num2;
            System.out.printf("answer is %.2f", ans );
            }
            
        case "*" -> {
            ans = num1 * num2;
            System.out.printf("answer is %.2f", ans );
            }
        
        case "/" -> {
            ans = num1 / num2;
            System.out.printf("answer is %.2f", ans );
            }
            
        case "+" -> {
            ans = num1 + num2;
            System.out.printf("answer is %.2f", ans );
            }
        
        default -> System.out.println("ERRROR");
        
    }
    }
}
