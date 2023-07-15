public class Odd
{
    public static void main (String[] args)
    {
        int i = 0;
        while (i != 100)
        {
            if (i % 2 == 1)
            {
                System.out.print(i + " ");
            }
            else if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}