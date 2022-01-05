package AbstractClasses;


abstract class Super{//Class containing an abstract method is certainly an abstract class
	
	public Super() {
		System.out.println("Super class Object is constructed");
	}
	
	public void meth1() {
		System.out.println("Super meth1");
	}
	
	abstract public void meth2();//If a method doen't have any body it is an abstract method
}

class Sub extends Super{
	
	public void meth2() {
		System.out.println("meth2 Sub");
	}
}
//class inhereting an abstract class is also abstract and it can be made concrete only if it overrides all the abstract methods from the super class



public class AbstractPractice {

	public static void main(String[] args) {
//		Super s= new Super();//We cant make an object of the abstract class
		Super s;//Though we can make a reference of it
		s= new Sub();//We can make an object from the constructor of the Sub class as it has overridden the abstract method from the abstract
		//Super class
		s.meth1();
		s.meth2();
		// we called meth1 from Super class and meth2 from Sub class
		

	}

}
