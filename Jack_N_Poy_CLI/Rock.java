package Jack_N_Poy_CLI;

public class Rock implements Hands
{
    @Override
    public void action(String name)
    {
        System.out.println(name + "picked rock!");
    }
}
