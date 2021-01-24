package com.design;

public class Main {
	public static void main(String args[])
	{
		 Student s1=new Student(1,"jack sparrow","Captain",23000,"carribean");  
         
	        s1.showRecord();  
	        System.out.println("\n");  
	        Student s2=(Student) s1. Clone();  
	        s2.showRecord();  
	}

}
