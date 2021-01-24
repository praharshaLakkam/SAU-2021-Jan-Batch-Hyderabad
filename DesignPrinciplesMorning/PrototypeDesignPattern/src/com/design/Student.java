package com.design;

class Student implements Prototype {
	 private int id;  
	   private String name, course;  
	   private double fee;  
	   private String address;
	   public Student()
	   {
		   System.out.println(" Student Records of KLU");  
           System.out.println("------------------------------------------------------");  
           System.out.println("Sid"+"\t"+"Sname"+"\t"+"Course"+"\t"+"Fee"+"\t\t"+"address");  
		   
		}
	public Student(int id, String name, String course, double fee, String address) {
		this();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
		this.address = address;
	}
	public void showRecord(){  
        
        System.out.println(id +"\t"+ name+"\t"+course+"\t"+fee+"\t"+address);  
   }
	public Prototype Clone() {  
        
        return new Student(id,name,course,fee,address);  
    }  
	   
}
