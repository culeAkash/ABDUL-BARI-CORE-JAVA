package OopsBasics;

public class Rectangle {
	private double length;
	private double breadth;
	
	//Non parameterised constructor
	public Rectangle() {
		length=1;
		breadth=1;
	}
	
	//Parameterised constructor
	public Rectangle(double l, double b) {
		length=l;
		breadth=b;
	}
	
	
	public Rectangle(double s) {
		length=s;
		breadth=s;
	}
	
	
	//Getters and Setters methods
	public void setLength(double l) {
		if(l>=0) {
		length=l;
		}			
	}
	
	public void setBreadth(double b) {
	if(b>=0) {
		breadth=b;
	}
	
	}
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	//Method to find area of the rectangle object
	public double area() {
		return length*breadth;
	}
	
	//Method to find peimeter of the rectangle
	public double perimeter() {
		return 2*(length+breadth);
	}
	
	
	
	
}


