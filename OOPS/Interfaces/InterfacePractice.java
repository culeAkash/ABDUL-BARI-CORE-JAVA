package Interfaces;


/*
 * An interface can extend from another interface
 * An interface can have a static method with body
 * An interface can have identifiers but static final(constant)
 * Abstract methods inside an interface has to be public as they are meant to be implemented
 * An interface can have default methods with body to prevent errors when only we want to change a method inside the interface, if we do not give the body and add an 
 * abstract class to the interface all the concrete classes implementing it will become abstract
 * An interface can also have private classes with body to be used inside default classes 
 * Public methods inside interfaces are always abstract
 * */

interface TestNew{
	final static int X=10;//Identifiers inside an interface is usually capitalised
	
	public abstract void meth1();
	public void meth2();
	
	private void meth() {
		System.out.println("Test1 meth3");
	}
	
	default void meth3() {
		meth();
	}
}

interface Test2New extends TestNew{
	public void meth4();
}

class My implements Test2New{
	
	public void meth1() {
}
	public void meth2() {
		
	}
	public void meth4() {
		
	}
}
//Now this class has to implement all the abstract classes from both Test2 and Test1 as Test2 extends from Test1



public class InterfacePractice {

	public static void main(String[] args) {
		My m= new My();
		m.meth3();

	}

}
