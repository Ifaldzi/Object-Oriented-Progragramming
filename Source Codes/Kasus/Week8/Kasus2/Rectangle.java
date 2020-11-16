package Kasus.Week8.Kasus2;

public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(double width, double length)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area()
    {
        return width * length;
    }

    public String toString()
    {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
