package Inheritance;


class TV{
	void switchON() {
		System.out.println("TV is switched on");
	}
	
	 void changeChannel() {
		System.out.println("Channel on TV is changed");
	}
}

//visibility of any overriding method must be linient that than the overrided method
//ex: if overrided method is private then overriding method must be public default etc. but if the former is public the later cant be private or protected or default
class SmartTV extends TV{
	@Override
	public void switchON() {
		System.out.println("Smart TV is switched on");
	}
	
	
	void changeChannel() {
		System.out.println("Channel on Smart TV is changed");
	}
	
	void browse() {
		System.out.println("Smart TV is browsing");
	}
}



//Exapmle 1 for method overriding
public class TVExample {

	public static void main(String[] args) {
		
//		SmartTV st= new SmartTV();
		TV st= new SmartTV();
		st.changeChannel();
		st.switchON();
		

	}

}
