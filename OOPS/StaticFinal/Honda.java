package StaticFinal;

class HondaCity{
	
	static long price=10;
	int a,b;
	
	static double priceOnRoad(String city) {
//		a=10;
//		Non static variable can't be accessed inside static method
		switch(city) {
		case "Delhi":
			return price+price*0.1;
		case "Mumbai":
			return price+price*0.9;
		default:
			return price+price*0.5;
	    }
	}
}

public class Honda {

	public static void main(String[] args) {
		HondaCity h1= new HondaCity();
		HondaCity h2= new HondaCity();
		
		h1.price=30;
		//It will get changed for all the objects and Class itself as it is a static variable and only one copy of it is created
		System.out.println(h1.priceOnRoad("Delhi"));
		System.out.println(h2.priceOnRoad("Mumbai"));
		System.out.println(HondaCity.priceOnRoad("kolkata"));

	}

}
