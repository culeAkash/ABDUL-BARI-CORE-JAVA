package StudentDB;

import java.util.ArrayList;

public class Student {
	private String name;
	private long rollNumber;
	private String department;
	private ArrayList<Subject> subjects;
	
	public Student(String name, long rollNumber, String department, ArrayList<Subject> subjects) {
		this.name= name;
		this.rollNumber= rollNumber;
		this.department= department;
		this.subjects= subjects;
	}
	
	public void setDepartment(String department) {
		this.department= department;
	}
	
	public String department() {
		return this.department;
	}
	
	public String name() {
		return this.name;
	}
	
	public long rollNumber() {
		return this.rollNumber;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void changeSubjectmarks(int marks, String subjectName) {
		if(subjectName=="Physics") {
			subjects.get(0).setMarks(marks);
		}
		else if(subjectName=="Maths") {
			subjects.get(1).setMarks(marks);
		}
		else if(subjectName=="Chemistry") {
			subjects.get(2).setMarks(marks);
		}
	}
	
	public Subject getSubjectDetails(String subjectName) {
		if(subjectName=="Physics") {
			return subjects.get(0);
		}
		else if(subjectName=="Maths") {
			return subjects.get(1);
		}
			return subjects.get(2);
	}
	
	public void getAllMarks() {
		for(Subject sub: subjects) {
			System.out.println(sub.getMarks());
		}
	}
	
	
}
