package Inheritance;



//class Rectangle{
//	
//	int length;
//	int breadth;
//	
//	
//	public Rectangle() {
//		length=breadth=1;
//	}
//	
//	public Rectangle(int length,int breadth) {
//		this.length= length;
//		this.breadth=breadth;
//	}
//}

class Cuboid{
	int height;
	
	public Cuboid() {
		height=1;
	}
	
	public Cuboid(int height) {
		this.height=height;
	}
	
	public Cuboid(int length,int breadth,int height) {
//		super(length,breadth);//To call the super class constructor with parameters
		//By default the non-parameterised super constructor gets called every time we make a child class object
		this.height=height;
	}
	
	public int volume() {
		return this.height;
	}
}


public class SuperConst {

	public static void main(String[] args) {
		Cuboid c= new Cuboid();//Non-parametrised of both child and parent classes will get called
//		Cuboid c= new Cuboid(10); Parameterised child constructor is called but not the parametrised parent constructor
//		Cuboid c= new Cuboid(20,30,40);
		//Now when three parameters are passed the child constructor taking three parameters is called from which two are passed to call the parameterised parent constructor
		System.out.println(c.volume());

	}

}
