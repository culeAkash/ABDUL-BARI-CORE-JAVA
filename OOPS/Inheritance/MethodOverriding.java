package Inheritance;



class Super{
	void display() {
		System.out.println("Hi Hello!");
	}
}

class Sub extends Super{
	//The sub-class method always overrides the parent class method
	void display() {
		System.out.println("Welcome!");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
//		Sub su= new Sub();
		Super su= new Sub();
		//Overriding alwys works based on constructor and not reference type
		su.display();

	}

}
