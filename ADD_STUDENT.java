import java.util.Scanner;
public class ADD_STUDENT
{
    public static Scanner in = new Scanner(System.in);
    public static int num;
    public static int studentCount = 0;
    public static int Size = 5;
    public static String [] FN = new String [Size];
    public static String [] MN = new String [Size];
    public static String [] LN = new String [Size];
    public static String [] Address = new String[Size];
    public static int [] ID = new int [Size];
    public static int limit = Size;
    public static String firstName, middleName, lastName, address;
    public static int StuID;
    public static boolean StudentExists = false;
    public static boolean StudentIDExists = false;
    public static String ans;
    public static void main(String [] args)
    {
        GetStudent();
    }
    public static void GetStudent()
    {
        FillInformation();
        if (studentCount == limit)
        {
            System.out.println("Max Student Limit Reached!");
            AskUser();
        }
        System.out.println("Please note that you can only input " + (limit - studentCount) + " students");
        GetNum();
        for (int i = 0; i < num; i++)
        {
            if (studentCount < limit)
            {
                do
                {
                    System.out.println("Student #" + (studentCount + 1));
                    System.out.print("Student ID Number: ");
                    StuID = in.nextInt();
                    in.nextLine();
                    System.out.print("First Name: ");
                    firstName = in.nextLine();
                    System.out.print("Middle Name: ");
                    middleName = in.nextLine();
                    System.out.print("Last Name: ");
                    lastName = in.nextLine();
                    System.out.print("Address: ");
                    address = in.nextLine();

                    StudentExists = checkDuplicateName(firstName, middleName, lastName);
                    StudentIDExists = checkDuplicateID(StuID);
                    if (StudentExists || StudentIDExists || StuID == 0)
                    {
                        System.out.println("Duplicate/Invalid student found. Please enter a different Student Name/ID.");
                    }
                }
                while (StudentExists || StudentIDExists || StuID == 0);
                FN[studentCount] = firstName;
                MN[studentCount] = middleName;
                LN[studentCount] = lastName;
                ID[studentCount] = StuID;
                Address[studentCount] = address;
                studentCount++;
            }
            else
            {
                System.out.println("Max Student Limit Reached!");
                break;
            }
        }
        GetResp();
    }
    public static void GetNum()
    {
        System.out.println("How many students would you like to input?");
        System.out.print("> ");
        num = in.nextInt();
        in.nextLine();
        if (num <= 0 || num > limit)
        {
            System.out.println("Error: invalid input. Please enter a number between 1 and " + limit);
            GetNum();
        }
    }
    public static boolean checkDuplicateName(String firstName, String middleName, String lastName)
    {
        for (int i = 0; i < studentCount; i++)
        {
            if (FN[i].equalsIgnoreCase(firstName) && MN[i].equalsIgnoreCase(middleName) && LN[i].equalsIgnoreCase(lastName))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean checkDuplicateID(int StuID)
    {
        for (int i = 0; i < studentCount; i++)
        {
            if (ID[i] == StuID)
            {
                return true;
            }
        }
        return false;
    }
    public static void GetResp ()
    {
        System.out.print("Do you want to enter another student? (Y/N): ");
        ans = in.nextLine();
        if (ans.equalsIgnoreCase("y"))
        {
            GetStudent();
        }
        else if (ans.equalsIgnoreCase("n"))
        {
            AskUser();
        }
        else
        {
            System.out.println("Invalid Input! Try Again!");
            GetResp();
        }
    }
    public static void FillInformation()
    {
        for (int i = 0; i < FN.length; i++)
        {
            if (FN[i] == null || MN[i] == null || LN[i] == null || ID[i] == 0 || Address[i] == null)
            {
                FN[i] = "Empty";
                MN[i] = "Empty";
                LN[i] = "Empty";
                Address[i] = "Empty";
                ID[i] = 0;
            }
        }
    }
    public static void List ()
    {
        System.out.printf("Slot #\t%-20s %-20s  %-20s  %-20s %-20s\n" , "Student ID", "First Name", "Middle Name", "Last Name" , "Address");
        for (int j = 0; j < FN.length; j++)
        {
            System.out.print(j + 1 + ".");
            System.out.printf("\t\t%-20d %-20S  %-20S  %-20S %-20S\n" , ID[j], FN[j], MN[j], LN[j] , Address[j]);
        }
    }
    public static void AskUser ()
    {
        System.out.print("Do you want to display all the Students? (Y/N): ");
        String resp = in.nextLine();
        if (resp.equalsIgnoreCase("y"))
        {
            List();
            InputMore();
        }
        else
        {
            System.out.println("Exiting Program...");
            System.exit(0);
        }
    }
    public static void InputMore()
    {
        System.out.print("Do you want to add more Students? (Y/N): ");
        String resp2 = in.nextLine();
        if (resp2.equalsIgnoreCase("y"))
        {
            GetStudent();
        }
        else
        {
            System.out.println("Exiting Program...");
            System.exit(0);
        }
    }
}
