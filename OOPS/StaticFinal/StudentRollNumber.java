package StaticFinal;

import java.util.Date;

class Student{
	
	private String roll_number;
	private static int count=1;
	
	public Student() {
		roll_number= generateRollNumber();
	}

	private String generateRollNumber() {
		Date d= new Date();
		this.roll_number= "Univ-"+(d.getYear()+1900)+"-"+count;//roll_number is in format "Univ-2022-studentCount"
		count++;
		return this.roll_number;
	}
	
	public String getRollNumber() {
		return this.roll_number;
	}
	
}



public class StudentRollNumber {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		System.out.println(s1.getRollNumber()+" "+s2.getRollNumber()+" "+s3.getRollNumber());

	}

}
