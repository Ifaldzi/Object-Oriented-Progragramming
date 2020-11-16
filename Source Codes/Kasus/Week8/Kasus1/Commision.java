package Kasus.Week8.Kasus1;

public class Commision extends Hourly
{
    private double totalSales;
    private double commisionRate;

    public Commision(String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double eCommisionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commisionRate = eCommisionRate;
    }

    public void addSales(double totalSales)
    {
        this.totalSales = totalSales;
    }

    public double pay()
    {
        double payment = super.pay() + commisionRate * totalSales;
        totalSales = 0;
        return payment;
    }

    public String toString()
    {
        return super.toString() + " Total sales = " + totalSales;
    }
}
