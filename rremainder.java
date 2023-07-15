public class rremainder
{
    public static void main (String [] args)
    {
        for(int i = 0; i < 11; i++)
        {
            int num = 2*(i) + 1;
            int div = num / 10;
            int remainder = num % 10;
            System.out.println(i + ".) " + div + " R." + remainder);
            if (remainder == 3)
            {
                System.out.println("Solution X = " + i);
                break;
            }
        }
    }
}
