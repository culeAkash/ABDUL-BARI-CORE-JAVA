package Inheritance;

public class Constructors {
	public static void main(String[] args) {
		GrandChild gc= new GrandChild();
		//When granchild is called first its super classes' and theri superclasses' constructors are called and then grandchild constructor is calledAKASGH JAISWALI
	}
}

 class Parent{
	public Parent() {
		System.out.println("Parent Constructor");
	}
}
 
 class Child extends Parent{
	 public Child() {
		 System.out.println("Child Contstructor");
	 }
 }
 
 class GrandChild extends Child{
	 public GrandChild() {
		 System.out.println("grandchild Conctructor");
	 }
 }
