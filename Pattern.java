public class Pattern
{
    public static void main (String [] args)
    {
        int x = 1;
        while (x <= 5)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            x++;
        }
    }
}
