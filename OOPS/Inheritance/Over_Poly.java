package Inheritance;
//In this we will learn plymorphism by method overloading and overrriding
//Polymorphism means same names different actions


//Overloading
class Overloading{
	public int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	public int max(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		if(b>a && b>c) {
			return b;
		}
		return c;
	}
}



class Super1{
	
	void display() {
		System.out.println("Super method");
	}
}

class Sub1 extends Super1{
	
	void display() {
		System.out.println("Sub Method");
	}
}

public class Over_Poly {

	public static void main(String[] args) {
		Super1 sup= new Sub1();
		sup.display();
		//Here method overriding is occuring by which the method to be called is decided only after constructing the object which is decide at run time 
		//and the compiler cant control the method to be called thus giving rise to run time polymorphism
		
		
		
//		Overloading o= new Overloading();
//		o.max(2, 3);
//		o.max(2,4,6);
		//here we are calling methods os=f same names bu they do different actions hence polymorphism is achieved
		//Compiler during compile time decides which method to call hence giving rise to compile time polymorphism
		
		
		
		
		
		
	}

}
