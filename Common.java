public class Common
{
    public static void main (String [] args)
    {
        int array1 [][][] =
                {
                        {
                                {1, 3, 5},
                                {7, 8, 9},
                                {12, 23, 43}
                        }
                };
        int array2 [][][] =
                            {
                                {
                                    {21, 22, 23},
                                    {24, 25},
                                    {26, 3}
                                }
                            };
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                for(int k = 0; k < array1[i][j].length; k++)
                {
                    for (int a = 0; a < array2.length; a++)
                    {
                        for (int b = 0; b < array2[a].length; b++)
                        {
                            for (int c = 0; c < array2[a][b].length; c++)
                            {
                                if (array1[i][j][k] == array2[a][b][c])
                                {
                                    System.out.println("Common sum is: " + array1[i][j][k]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
