package OopsBasics;

 class Cylinder{
	private double radius;
	private double height;
	
	public Cylinder(){
		radius=1;
		height=1;
	}
	
	public Cylinder(double r, double h) {
		radius=r;
		height=h;
	}
	
	//Getters and setters mothods
	public void setRadius(double r) {
		if(r>=0) {
			radius=r;
		}
	}
	
	public void setHeight(double h) {
		if(h>=0) {
			height=h;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	//to get volume of the cylinder
	public double volume() {
		return 3.14*radius*radius*height;
	}
	
	//To get area of bases of the cylinder
	public double baseArea() {
		return 2*3.14*radius*radius;
	}
	
	//To get curved area of the cylinder
	public double curvedArea() {
		return 2*3.14*radius*height;
	}
	
	//To get total area of the cylinder
	public double totalArea() {
		double area=baseArea()+curvedArea();
		return area;
	}
	
	
	
}

 class CylinderUse{
	public static void main(String[] args) {
		Cylinder c1= new Cylinder();
		c1.setHeight(2);
		c1.setRadius(4);
		
		System.out.println(c1.baseArea());
		System.out.println(c1.totalArea());
		System.out.println(c1.curvedArea());
	}
}
