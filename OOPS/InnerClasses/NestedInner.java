package InnerClasses;

/*
 * Inner classes are classes inside classes
 * They are used to reduce the complexity of big classes
 * The Inner Class can access all the variables and methods of Outer class directly
 * But Outer class can only access the contents of Inner Class after via its object
 * An Outer class Object can be made directly and Inner class methods can not be accessed by Outer class' object
 * An inner class object can be made only after the construction of Outer class object 
*/

class Outer{
	int x=10;
	
	class Inner{
		int y=20;
		
		void displayInner() {
			System.out.println(x);
			System.out.println(y);
//			displayOuter();
		}
	}
	
	void displayOuter() {
		System.out.println(x);
//		System.out.println(y);
		Inner i= new Inner();
		//Inner class object can only be constructed inside the outer class directly
		i.displayInner();
		System.out.println(i.y);
	}
}


public class NestedInner {

	public static void main(String[] args) {
		Outer.Inner i= new Outer().new Inner();//constructor syntax to construct an inner class
		Outer o= new Outer();
		o.displayOuter();
		i.displayInner();

	}

}
