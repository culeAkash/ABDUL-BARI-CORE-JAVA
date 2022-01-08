package StaticFinal;

/*
 * We can write a set of statements inside a block and declare that block to be static
 * The static block executes when classloader loads the class. A static block is invoked before main() method.
 * They are used to initialise a value with the loading of class
 * */



class Test1{
	static int s;
	int a;
	
	static {
		s=10;
//		a=2; We can't access a non-static variable inside a static block
		System.out.println("Block1");
	}
	
	static {
		System.out.println("block2");
	}
}


public class StaticBlock {

//	static {
//		System.out.println("Block1");
//	}
//	
//	static {
//		System.out.println("Block2");
//	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		//if the static blocks are in another class w.r.t to main() then they will get executed only when the class' object is constructed
		Test1 t= new Test1();

	}//When the static blocks are in the same class as the main the blocks get executed before the main method

}
