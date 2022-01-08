package StaticFinal;

/*
 * Singleton class is a class of which only one object can be made
 * */


//Let's say there is coffee machine installed in an office, then every time someone wants to drink coffee they will not get a new coffee machine
//All of them will use the same coffee machine
class CoffeeMachine{
	private float coffeeQty;
	private float waterQty;
	private float milkQty;
	private float sugarQty;
	//contents used to make coffee
	
	//Now we want a reference of my coffeemachine
	static CoffeeMachine myMachine= null;
	
	//Constructor
	private CoffeeMachine() {
		coffeeQty=1;
		waterQty=1;
		milkQty=1;
		sugarQty=1;
	}//constructor is private hence we can't construct the coffee machine object directly
	
	
	//Utility methods
	
	public void fillCoffee(float qty) {
		coffeeQty+=qty;
	}
	
	public void fillWater(float qty) {
		waterQty+= qty;
	}
	
	public void fillMilk(float qty) {
		milkQty+= qty;
	}
	
	public void fillSugar(float qty) {
		sugarQty+= qty;
	}
	
	public float getCoffee() {
		return 2.5f;
	}
	
	//there must be a static method to construct coffee machine object to restrict only one object
	public static CoffeeMachine getInstance() {
		if(myMachine==null)
			myMachine= new CoffeeMachine();
		return myMachine;
	}//If no machine is constructed then a machine will get constructed
	//If a machine is already constructed the previous reference will be given again and given thus singleton class
	
	
	
}


public class SingletonPractice {

	public static void main(String[] args) {
	 CoffeeMachine c=CoffeeMachine.getInstance();
	 CoffeeMachine a= CoffeeMachine.getInstance();
	 System.out.println(c+" "+a);
	 //two people ordered coffee but they got the same coffee machine i.e same object is provided to both the constructor calls

	}

}
