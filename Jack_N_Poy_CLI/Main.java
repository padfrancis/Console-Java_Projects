package Jack_N_Poy_CLI;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    static Rock rock = new Rock();
    static Paper paper = new Paper();
    static Scissors scissors = new Scissors();
    public static int Comp = rand.nextInt(3)+1, choice;
    public static String name, CompName = "Opponent";
    public static void main (String [] args)
    {
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println("------------------------------------");
        do
        {
            System.out.println("Rock Paper Scissors");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = in.nextInt();
            if (choice == 0 || choice > 3)
            {
                System.out.println("Invalid choice!");
            }
            else
            {
                Picked();
            }
        }while(choice!= 4);
    }
    public static void Picked ()
    {
        if (choice == 1)
        {
            if (Comp == 1)
            {
                System.out.println("Its a tie");
            }
            else if (Comp == 2)
            {
                System.out.println("Opponent wins!");
            }
            else
            {
                System.out.println(name + " wins!");
            }
        }
        else if (choice == 2)
        {
            paper.action(name);
            if (Comp == 2)
            {
                paper.action(CompName);
            }
        }
        else if (choice == 3)
        {
            scissors.action(name);
            if (Comp == 3)
            {
                scissors.action(CompName);
            }
        }
        //main(new String [] {});
    }
}
