package Interfaces;

//A SmartPhone can be considered as a Phone too

class Phone{
	
	void call() {
		System.out.println("Call feature is added");
	}
	
	void sms() {
		System.out.println("sms feature is added");
	}
	//Doing call or sending messages can only be done by one procedure so it is explicitly standardised by the Phone Standards
	//Each phone must have these functions and by this procudre only
}

interface Camera{
	
	void click();
	void record();
	//A camera must have these features but its implementattion depends on company or phonr to phone
}

interface MusicPlayer{
	void play();
	void pause();
	void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
	
	public void click() {
		System.out.println("photos can be clicked");
	}
	
	public void record() {
		System.out.println("Videos can be recorded");
	}
	
	public void play() {
		System.out.println("Music can be played");
	}
	
	public void pause() {
		System.out.println("Music can be paused");
	}
	
	public void stop() {
		System.out.println("Music can be stopped");
	}
}
//Now Smartphone has extended the Phone class and will implement camra and <usicplayer interfaces to become a concrete class and then its objects can be constructed




public class InterfaceExample {

	public static void main(String[] args) {
//		Phone s= new SmartPhone();//When phone is taken as referencce it can be used to make only calls and send sms
//		Camera s= new SmartPhone();//with camera as reference only mthods can be  called
//		MusicPlayer s= new SmartPhone();//only Musicplayer's methods can be called
		SmartPhone s= new SmartPhone();
		s.call();
		s.click();
		s.play();

		//We someone asks for a camera and i give him my smartphone then he is supposed to only click photos and record videos and if he wants to use other functionalities then
		//he referred to it wrong, he should have referred to a SmartPhone and not Camera
	}

}
