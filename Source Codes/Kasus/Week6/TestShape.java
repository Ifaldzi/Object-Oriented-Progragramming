public class TestShape
{
	public static void main(String[] args) 
	{
		Shape shape = new Shape();
		System.out.println(shape.toString());

		Shape shape2 = new Shape("blue", false);
		System.out.println(shape2.toString());

		Circle2 circle = new Circle2();
		System.out.println(circle.toString());
		System.out.println("area=" + circle.getArea() + ", perimeter=" + circle.getPerimeter());

		Circle2 circle2 = new Circle2(4.0);
		System.out.println(circle2.toString());
		System.out.println("area=" + circle2.getArea() + ", perimeter=" + circle2.getPerimeter());

		Circle2 circle3 = new Circle2(2.0, "black", false);
		System.out.println(circle3.toString());
		System.out.println("area=" + circle3.getArea() + ", perimeter=" + circle3.getPerimeter());

		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		System.out.println("area=" + rectangle.getArea() + ", perimeter=" + rectangle.getPerimeter());

		Rectangle rectangle2 = new Rectangle(2.0, 1.0);
		System.out.println(rectangle2.toString());
		System.out.println("area=" + rectangle2.getArea() + ", perimeter=" + rectangle2.getPerimeter());

		Rectangle rectangle3 = new Rectangle(3.0, 5.0, "white", false);
		System.out.println(rectangle3.toString());
		System.out.println("area=" + rectangle3.getArea() + ", perimeter=" + rectangle3.getPerimeter());

		Square square = new Square();
		System.out.println(square.toString());
		System.out.println("area=" + square.getArea() + ", perimeter=" + square.getPerimeter());

		Square square2 = new Square(3.0);
		System.out.println(square2.toString());
		System.out.println("area=" + square2.getArea() + ", perimeter=" + square2.getPerimeter());

		Square square3 = new Square(5.0, "cyan", false);
		System.out.println(square3.toString());
		System.out.println("area=" + square3.getArea() + ", perimeter=" + square3.getPerimeter());
	}
}