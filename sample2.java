

public class sample2
{
    public static void main(String[] args)
    {
        int num = 10;
        String result = "";
        for (int i = num; i >= 0; i--)
        {
            if (i % 2 == 0)
            {
                result += i;
            }
            else
            {
                continue;
            }
            result += " ";
        }
        System.out.println(result);
    }
}
