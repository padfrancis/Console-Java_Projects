import java.util.Scanner;

public class Rectangle
{
    public static double length, width, per;
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Rectangle: ");
        length = in.nextDouble();
        System.out.print("Enter the width of your Rectangle: ");
        width = in.nextDouble();
        Area();
        Perimeter();
        Length();
    }
    static void  Area ()
    {
        double area = length * width;
        System.out.println("The area of your Rectangle is: " + area);
    }
    static void Perimeter ()
    {
        per =  2 * (length + width);
        System.out.println("The Perimeter of your Rectangle is: " + per);
    }
    static void Length ()
    {
        double lng = (per / 2) - width;
        System.out.println("The Length of your Rectangle is: " + lng);
    }
}
