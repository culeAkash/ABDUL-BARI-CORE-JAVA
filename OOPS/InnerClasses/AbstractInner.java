package InnerClasses;

/*
 * These inner classes are like nested inner classes but their object can be constructed directly without constructing the outer class' object
 * A static inner class can only access the static variable and methods in the outer class
 * */

class Outer3{
	static int x=10;
	int y=20;
	
	public Outer3() {
		System.out.println("Outer3 constructer");
	}
	static class Inner3{
		public Inner3() {
			System.out.println("Inner3 constructer");
		}
		
		public void displayInner() {
			System.out.println(x);
//			System.out.println(y);//y is a non-static variable of outer class
		}
	}
}


public class AbstractInner {

	public static void main(String[] args) {
		Outer3.Inner3 i= new Outer3.Inner3();
		//Only inner class object is made and "Outer3 constructer" is not printed
		i.displayInner();

	}

}
