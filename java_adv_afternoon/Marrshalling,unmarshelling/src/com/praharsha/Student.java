package com.praharsha;
import javax.xml.bind.annotation.*;
@XmlRootElement(name="student")
public class Student {
	private int roll,marks;
	private String subject;
	@XmlElement
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@XmlElement
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@XmlElement
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Student(int roll, int marks, String subject) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.subject = subject;
	}
	public Student() {
		super();
	}
	

}
