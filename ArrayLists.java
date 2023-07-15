import java.util.ArrayList;
public class ArrayLists
{
    public static void main (String[] args)
    {
        ArrayList <Double> decs = new ArrayList<>();
        ArrayList <Integer> nums = new ArrayList<>();
        decs.add(5.75); decs.add(3.55); decs.add(4.21); decs.add(2, 5.0);
        nums.add(15); nums.add(25); nums.add(27);
        System.out.println(nums.get(decs.size()/2) * 10);
        System.out.println(nums.get(1)*nums.get(2));
        nums.add(0, 95);
        System.out.println(nums.get(2) + " Number");
        System.out.println(decs.get(0) - decs.get(3) * nums.size());
        System.out.println("BSIT = " + nums.get(1));
    }
}