package Kasus.Week6;

public class Square extends Rectangle
{
	public Square()
	{
		super();
	}

	public Square(double side)
	{
		super(side, side);
	}

	public Square(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}

	public double getSide()
	{
		return getLength();
	}

	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}

	@Override
	public void setLength(double length)
	{
		setSide(length);
	}

	@Override
	public void setWidth(double width)
	{
		setSide(width);
	}

	@Override
	public double getArea()
	{
		return super.getArea();
	}

	@Override
	public double getPerimeter()
	{
		return super.getPerimeter();
	}

	@Override
	public String toString()
	{
		return "A square with side=" + getSide()
				+ ", which is a subclass of " + super.toString();
	}
}