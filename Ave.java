import java.util.*;
public class Ave
{
    public static Scanner in = new Scanner(System.in);
    public static String [] subs = new String[8];
    public static void main (String [] args)
    {
        AddSubs();
    }
    public static void AddSubs()
    {
        for (int i = 0; i < subs.length; i++)
        {
            System.out.print("Subject #" + (i+1) + ": ");
            subs[i] = in.nextLine();
        }
        viewAverage();
    }
    public static void viewAverage()
    {
        getAve();
    }
    public static void getAve ()
    {
        int ave;
        double sum = 0;
        double aver;
        for (int i = 0; i < subs.length; i++)
        {
            ave = Integer.parseInt(subs[i]);
            sum += ave;
        }
        aver = sum /8;
        System.out.println("Your Average is: " + aver);
    }
}
