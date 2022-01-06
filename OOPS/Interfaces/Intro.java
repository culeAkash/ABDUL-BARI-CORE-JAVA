package Interfaces;

//An Interface is an abstract class with all its methods abstract
// It is only used to achieve run-time polymorphism
// A class implements an Interface
// A sub-class can inherit or extend only one abstract class but it can implement multiple interfaces
//Just like Abstract classes interface can only be used as a reference but its object can never be constructed

interface Test1{
	
	public void meth1();
	public void meth2();
	//We dont have to declare the incomplete methods to be abstract if written inside an interface
}

class Test2 implements Test1{
	//Now Test2 class must override the incomplete methods from the interface Test1 just like in abstract classes
	
	public void meth1() {
		System.out.println("meth1 implemented");
	}
	
	public void meth2() {
		System.out.println("meth2 implemented");
	}
	//Test2 now implemented all the incomplete methods from the interface Test1 and can be considered as a concrete class
}



public class Intro {

	public static void main(String[] args) {
		Test1 t= new Test2();
		
		t.meth1();
		t.meth2();

	}

}
