import java.util.*;
public class Commission2
{
    static Scanner in = new Scanner(System.in);
    public static void main (String [] args)
    {
        System.out.print("Enter amount for SalesFigure: ");
        double sales = in.nextDouble();
        System.out.print("Enter amount for Commission Percentage: ");
        double per = in.nextDouble();
        System.out.print("Enter amount for CommissionRate: ");
        int rate = in.nextInt();

        Commission commission = new Commission(sales, per, rate);
        commission.computerCommission(sales, per);
        commission.computerCommission(sales, rate);
        commission.computerCommission(sales);
    }
}
class Commission
{
    int commissionrate;
    double salesfigure, commissionRate;
    public Commission(double salesfigure, double commissionRate, int commissionrate) {
        this.salesfigure = salesfigure;
        this.commissionrate = commissionrate;
        this.commissionRate = commissionRate;
    }
    public void computerCommission (double sales, double rate)
    {
        double multi = sales * rate;
        System.out.println("Commission: " + multi);
    }
    public void computerCommission (double salesfigure, int commissionrate)
    {
        double val = 100.00;
        int div = (int) (commissionrate / val);
        double multi = salesfigure * div;
        System.out.println("Commission: " + multi);
    }
    public void computerCommission (double sales)
    {
        double percent = sales * 0.075;
        System.out.println("Commission: " + percent);
    }
}
