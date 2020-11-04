public class Shape
{
	private String color;
	private boolean filled;

	public Shape()
	{
		color = "green";
		filled = true;
	}

	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	public String getColor()
	{
		return this.color;
	}

	public boolean isFilled()
	{
		return this.filled;
	}

	public String toString()
	{
		return "A shape with color of " + this.color
				+ " and " + (filled?"filled":"Not filled");
	}
}