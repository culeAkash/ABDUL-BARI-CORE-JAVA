package InnerClasses;

/*
 * Local inner class is the inner class which can be used only inside a method in the Outer class
 * It is defined inside the method and can be used in it too
 * This type of classes are used to define classes which are used only once in order to get rid of an entire new class
 * Local Inner classes outside the method are invisible
 * */


class Outer1{
	void display() {
		System.out.println("Inside display method");
		class Inner{
			
			void displayInner() {
				System.out.println("Hello");
			}
			public Inner() {
				System.out.println("Inner object is constructed");
			}//this class can't be accessed outisde this method
			
		}
		Inner i= new Inner();
		i.displayInner();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		Outer1 o= new Outer1();
		o.display();

	}

}
