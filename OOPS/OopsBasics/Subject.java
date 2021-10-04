package OopsBasics;
//Learning Object Arrays
public class Subject {
	private String name;
	private String subID;
	private static int maxMarks=0;
	private int marksObtained;
	
	
	public Subject(String name, String subID,int marksObtained) {
		this.name= name;
		this.subID= subID;
		this.marksObtained= marksObtained;
		maxMarks= Math.max(marksObtained, maxMarks);
	}
	
	public Subject(String name, String subID) {
		this.name= name;
		this.subID= subID;
		this.marksObtained= 0;
		maxMarks= Math.max(marksObtained, maxMarks);
	}
	
	public void setMarks(int marksObtained) {
		this.marksObtained= marksObtained;
		maxMarks= Math.max(marksObtained, maxMarks);
	}
	
	public int getMarks() {
		return marksObtained;
	}
	
	public int maxMarks() {
		return maxMarks;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSubID() {
		return this.subID;
	}
	
}
