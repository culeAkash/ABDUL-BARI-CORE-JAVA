package AbstractClasses;
//Here we are going to study Hospital to get a idea about Abstract classes

abstract class Hospital{
	
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}
//An abstract class can be considered as a governing body giving out guidelines which has to be implemented in order
//to open a hospital and a governing body doesnt have its own hospital similarly an object of this class cant be constructed
//We are independent to implement the guidelines our way but they have to be there


class MyHospital extends Hospital{
	public MyHospital() {
		System.out.println("Hospital is made");
	}
	
	void emergency() {
		System.out.println("Emergency is handled");
	}
	
	void appointment() {
		System.out.println("Appointment is handled");
	}
	
	void admit() {
		System.out.println("Patients can get admitted");
	}
	
	void billing() {
		System.out.println("Billing is handled");
	}
}
//In order to open my own hospital I have to follow all the giudelines and have all the required facilities,i.e override all the abstract methods of the Hospital class
//Without all the abstract methods(guidelines) handled a new hospital cant be constructed




public class HospitalUse {

	public static void main(String[] args) {
		Hospital h= new MyHospital();
		//We all refer to a hospital by hospital and not by its full name but it is made by the full name only
		
		h.appointment();
		h.admit();
		h.billing();
		h.emergency();

	}

}
