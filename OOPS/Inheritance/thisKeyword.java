package Inheritance;



class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
//		length=length;//if we do not use (this) keyword the compiler will understand that we are trying to assign the parameters to itself
		this.length=length;
		this.breadth=breadth;
	}
	//by (this) keyword we distinguish between parameters and properties of the object
	
	void display() {
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}


public class thisKeyword {

	public static void main(String[] args) {
		Rectangle r= new Rectangle(30, 20);
		r.display();

	}

}
