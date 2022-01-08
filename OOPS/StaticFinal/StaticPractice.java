package StaticFinal;

/*
 * Static members of the class are used to give info about the class and not solely its objects.
 * Static variables or methods are always created once and inside the method list only and that sole copy is accessed by all the objects.
 * Non-static members are generated separately inside all the object separately.
 * Static members can be accessed by Static methods and Inner classes and object instances only.
 * Non-static members can't be accessed by static methods and inner classes.
 * final and super members can't be accessed by static methods and static inner classes, because final are super keywords are used to
   refer to the objects instances separately and not classes itself.
 */

class Test{
	
	static int x=10;
	int y=20;
	
	
	 void show() {
		 System.out.println(x+" "+y);
	 }//Non-static method can access both static and non-static members
	 
	 static void display() {
//		 System.out.println(x+" "+y);
//		 Cannot make a static reference to the non-static field y, as display() is a static method
		 System.out.println(x);
	 }
}


public class StaticPractice {

	public static void main(String[] args) {
		
		Test t1= new Test();
		Test t2= new Test();
		
		t1.show();
		t1.x=30;
		t1.y=50;
		//Here value of x changes for both t1 and t2 as there is only one copy of x as it is a static variable
		//But since y is a non-static variable it only changes for t1 and not t2
		t2.show();
		t1.show();
		System.out.println(Test.x);
	}

}
