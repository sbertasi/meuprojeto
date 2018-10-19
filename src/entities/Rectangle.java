package entities;

public class Rectangle {
	public static double width;
	public static double height;
	
	public static double area() {
		return width * height;
	}
	public static double perimeter() {
		return 2 * (width + height);
	}
	public static double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
