package AbstractClasses;

//Like Hospital KFC also dont have any outlets of theirs they give out franchises and some guidelines to followin order to get their franchise


abstract class KFC{
	
	public KFC() {
		System.out.println("Contract is given");
	}
	
	public void makeItem() {
		System.out.println("Standard recipe gievn");
		//standard recipe that must be followed by all franchises no matter what
	}
	
	abstract void billing();
	abstract void offer();
	//A KFC outlet must have billing and offers but how these are implemented are left out to the franchise making them abstract or incomplete
}
//These are guidelines or standards set by KFC
//Again,KFC doesnt have its own shop it only gives out franchises which are refverred by their nanme, hence a KFC object cant be constructed
//Only its reference can be given

class MyKFC extends KFC{
	
	public MyKFC() {
		System.out.println("Got contract");
	}
	
	public void billing() {
		System.out.println("Billing is handled");
		//in order to open the franchise we must implement the standard given by KFC
	}
	
	public void offer() {
		System.out.println("Offers are given");
	}
}
//Once all the standards are maintained the new franchise can be constructed ,i.e object of this class can be made


public class KFCUse {

	public static void main(String[] args) {
		
		KFC kfc= new MyKFC();
		//We irl dont know the franchise name we refers all of them by KFC itself so KFC class can be used as reference
		//But the shop is legally opened in the name of franchise so it is constructed by the MyKFC class only
		
		kfc.billing();
		kfc.offer();

	}

}
