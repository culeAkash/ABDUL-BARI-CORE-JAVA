package InnerClasses;

/*
 * Anonymous classes are defined inside a class to implement an interface or abstract class
 * It is basically used to construct object of an interface by overriding its abstract methods on the go and the compiler treats the object as the object of an anonymous class
 * It is used to use interfaces when they are required limited and we want to reduce the fuss of writing an entire new class to implement it
 * */

interface Inner2{
	void display();
}

class Outer2{
	public void meth() {
		Inner2 i= new Inner2() {
			public void display() {
				System.out.println("Hi");
			}
		};//Anonymous class, can be used inside this method only
		i.display();
	}
}

public class AnonymousInner {

	public static void main(String[] args) {
		Outer2 o= new Outer2();
		o.meth();

	}

}
