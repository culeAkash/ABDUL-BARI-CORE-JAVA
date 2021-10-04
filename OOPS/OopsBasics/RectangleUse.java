package OopsBasics;

public class RectangleUse {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.setLength(10);
		r.setBreadth(20);
		System.out.println(r.perimeter());
		System.out.println(r.area());
		
		Rectangle r2= new Rectangle(20,30);
		System.out.println(r2.getLength());
		System.out.println(r2.getBreadth());
		r2.setBreadth(2);
		System.out.println(r2.perimeter());
		System.out.println(r2.area());
	}

	
	
}


