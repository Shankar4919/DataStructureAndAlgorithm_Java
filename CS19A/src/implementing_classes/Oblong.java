package implementing_classes;

public class Oblong {
	// attribute
	private double length;
	private double height;
	// methods
	// constructor: this is user define constructor
	// if not defined, one is automatically defined called default constructor
	// we can define several constructor in one class
	public Oblong(double lengthIn, double heightIn) {
		length=lengthIn;
		height=heightIn;
	}
	// this method allows us to read the length attribute
	public double getLength() {
		return length;
	}
	
	// this method allows us to read the height attribute
	public double getHeight() {
		return height;
	}
	// this method allows us to set the length attribute
	public void setLength(double lengthIn) {
		length=lengthIn;
	}
	
	// this method allows us to set the height attribute
	public void setHeight(double heightIn) {
		height=heightIn;
	}
	
	// this method gives the area of the Oblong
	public double calculateArea() {
		return length*height;
	}
	
	// this method gives the perimeter of the Oblong
	public double calculatePerimeter() {
		return 2*(length+height);
	}
}
