package AbstractClasses;



abstract class Shape{
	 
	abstract double perimeter();
	abstract double area();
}
//A shape must have an area and a perimeter but as we dont know the shape we cant have the peroperties or the formula yet

class Circle extends Shape{
	int radius=1;
	
	double perimeter() {
		return (int)(2*Math.PI*this.radius);
	}
	
	double area() {
		return (Math.PI*this.radius*this.radius);
	}
}
//Circle is a shape implementing the perimeter and area which are basic functionalities of a shape

class Rectandle extends Shape{
	int length=1;
	int breadth=1;
	
	double perimeter() {
		return 2*(this.length+this.breadth);
	}
	
	double area() {
		return this.length*this.breadth;
	}
}

//Rectangle is a shape implementing the perimeter and area which are basic functionalities of a shape



//Shape cant be constructed as it can be any shape and not specified hence its object cant be built  but can be used to reference all types of shapes like circle and rectangle




public class ShapeUse {

	public static void main(String[] args) {
		
		Shape c= new Circle();
		System.out.println(c.area());

	}

}
