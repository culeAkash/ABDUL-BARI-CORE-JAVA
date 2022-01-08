package StaticFinal;

/*
 * Final keyword is used to declare a variable constant, once declared it can't be changed
 * Final methods can't be overrided by sub-class
 * Final classes can't be inherited by other classes
 * Final variables must be initialised at the time of loading of the class, so that can be done in three ways:
 * 1. at the time of declaration
 * 2. inside a block
 * 3. inside the class constructor, but it must be initialised inside each constructor if the class has multiple constructors
 * */

//final class Test2{
//cant inherit final class


class Test2{
	
	 final int MIN=10;
	 final static int NORMAL;
	 final int MAX;
//	a=10;//we cant insitialise it inside a final variable inside a class later
	
	static{
		NORMAL=10;//but we can do this inside a block
	}//If the variable is static then the block must be static too
	
	Test2(){
		MAX=30;//final variables can also be insitialised inside the constructor of the class
	}
	
	Test2(int b){
		MAX=30;
		System.out.println(b);
		//Initialised in all the constructors
	}
	
	final void display() {
		System.out.println("hello");
	}
	
}

class Test3 extends Test2{ 
//	 void display() {
//		 System.out.println("Hi");
//	 }//can't override final methods
}



public class FinalPractice {

	public static void main(String[] args) {
		final float PI;
		PI= 3.14f;//If we declare a final variable inside a method then we can initilaise it late

	}

}
