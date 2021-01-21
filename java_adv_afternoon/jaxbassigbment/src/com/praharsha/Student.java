package com.praharsha;
import javax.xml.bind.annotation.*;
@XmlRootElement(name="student")
public class Student {
   private String name,planguage,status;
   private int update;
	public Student(String name, String planguage, String status, int update) {
		super();
		this.name = name;
		this.planguage = planguage;
		this.status = status;
		this.update=update;
	}
	public Student() {
		super();
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getPlanguage() {
		return planguage;
	}
	public void setPlanguage(String planguage) {
		this.planguage = planguage;
	}
	@XmlElement
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@XmlElement
	public int getUpdate() {
		return update;
	}
	public void setUpdate(int update) {
		this.update = update;
	}
	

}
