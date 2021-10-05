package Inheritance;

class Circle{
	 double radius;
	 
	 public Circle() {
		 radius= 0.0;
	 }
	 
	 public double area() {
		 return Math.PI*radius*radius;
	 }
	
	 public double perimeter() {
		 return Math.PI*2*radius;
	 }
	 
	 public double circumference() {
		 return perimeter();
	 }
	
}

//The cylinder class inherits the properties of the Circle class
//All the properties of circle are present in cylinder class
class Cylinder extends Circle{
	double height;
	
	public Cylinder() {
		height=0.0;
	}
	
	public double volume() {
		return area()*height;
	}
}

class Circle_Cylinder_Class {
	public static void main(String[] args) {
		Circle c1= new Circle();
		Cylinder c2= new Cylinder();
		
		c2.radius= 3;
		c2.height=4;
		
		System.out.println(c2.perimeter());
		System.out.println(c2.volume());
	}
}
