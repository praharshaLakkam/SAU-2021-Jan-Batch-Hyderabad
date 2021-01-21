package com.praharsha;
import java.util.List;  

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
@XmlRootElement(name="students")
public class Students {
	private int id;
	private String organization;
	private List<Student>student;
	public Students()
	{
		
	}
	public Students(int id, String organization, List<Student> student) {
		super();
		this.id = id;
		this.organization = organization;
		this.student = student;
	}
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@XmlElement
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	

}
