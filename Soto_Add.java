import java.util.Scanner;
public class Soto_Add
{
    public static String[] first = { "Empty", "Empty", "Empty" };
    public static String[] second = { "Empty", "Empty", "Empty" };
    public static String[] last = { "Empty", "Empty", "Empty" };
    public static String firstN, secondN, lastN;

    public static Scanner in = new Scanner(System.in);
    public static boolean[] slotOccupied = { false, false, false };

    public static void main(String[] args)
    {
        Add();
    }
    public static void Add()
    {
        System.out.println("Max Slot: 3");
        System.out.print("Enter Slot #: ");
        int slot = in.nextInt() - 1;
        in.nextLine();
        if (slot < 0 || slot >= first.length)
        {
            System.out.println("Invalid Slot! Try Again!");
            Add();
            return;
        }
        if (slotOccupied[slot])
        {
            System.out.println("Slot #" + (slot + 1) + " is already occupied. Please enter a different slot.");
            Add();
            return;
        }
        System.out.println("Slot #" + (slot + 1));
        System.out.print("Enter First Name: ");
        firstN = in.nextLine();
        System.out.print("Enter Middle Name: ");
        secondN = in.nextLine();
        System.out.print("Enter Last Name: ");
        lastN = in.nextLine();

        first[slot] = firstN;
        second[slot] = secondN;
        last[slot] = lastN;
        slotOccupied[slot] = true;

        boolean allSlotsOccupied = true;
        for (boolean occupied : slotOccupied)
        {
            if (!occupied) {
                allSlotsOccupied = false;
                break;
            }
        }
        if (allSlotsOccupied)
        {
            System.out.println("All slots are occupied. Exiting the program.");
            return;
        }
        Add();
    }
}