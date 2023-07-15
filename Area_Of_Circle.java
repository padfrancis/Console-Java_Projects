import java.util.*;
public class Area_Of_Circle
{
    public static Scanner in = new Scanner(System.in);
    public static int rad;
    public static void main (String [] args)
    {
        System.out.print("Enter the Radius of the Circle: ");
        rad = in.nextInt();
        System.out.printf("The area of Circle is: %.2f\n" , Area(rad));
    }
    public static double Area (double calcu)
    {
        calcu = Math.PI * rad * rad;
        return calcu;
    }
}
