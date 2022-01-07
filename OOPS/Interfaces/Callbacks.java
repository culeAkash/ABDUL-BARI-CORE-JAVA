package Interfaces;

interface Member{
	public void callBack();
}
//A member is a customer of the store who gets early notifications about any sales that are going to happen in the store

class Customer implements Member{
	String name;
	public Customer(String n) {
		name=n;
	}
	
	public void callBack() {
		System.out.println("Ok,I will visit,"+name);
	}
	//When a customer receives a call from store it will reply
}

class Store{
	Member[] members= new Member[10];
	int count=0;
	//There can be limited members of the store
	
	public void register(Member m) {
		members[count++]=m;
	}//Whenever a new member is registered count in incremented
	
	public void inviteSale() {
		
		for(int i=0;i<count;i++) {
			members[i].callBack();
		}
	}
	//When there is a sale a call is made to all the members of the store
	
}




public class Callbacks {

	public static void main(String[] args) {
		Member m= new Customer("Akash");//A new customer is constructed
		Store s= new Store();
		s.register(m);//registration
		Member k= new Customer("Kuki");
		s.register(k);
		s.inviteSale();//invite when Sale

	}

}
