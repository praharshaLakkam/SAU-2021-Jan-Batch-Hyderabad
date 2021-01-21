package com.praharsha;
import java.io.File;  
import java.util.List;  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller; 
import java.io.File;
import java.io.PrintWriter;
public class Main {
   public static void main(String args[])
   {
	   try {  
		   
	        File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\javafundamentals1\\src\\students.xml");  
	        JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);  
	   
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	        Students stu= (Students) jaxbUnmarshaller.unmarshal(file);  
	          
	        System.out.println(stu.getId()+" "+stu.getOrganization());  
	        System.out.println("Students list in this organisation:"); 
	        System.out.println("Roll  Marks SUbject");
	        List<Student> list=stu.getStudent(); 
	        int arr[]=new int[100];
	        for(int i=0;i<100;i++)
	        {
	        	arr[i]=0;
	        }
	        for(Student ans:list) 
	        {
	          int a=ans.getRoll();
	          int b=ans.getMarks();
	          String c=ans.getSubject();
	          System.out.println(a+"     "+b+"      "+c);
	          arr[a]=arr[a]+b;
	      } 
	        System.out.println("id   total marks");
	        for(int i=0;i<100;i++)
	        {
	        	if(arr[i]!=0)
	        	{
	        		System.out.println(i+"    "+ arr[i]);
	        	}
	        }
	        
	        PrintWriter writer = new PrintWriter(new File("C:\\Users\\ADMIN\\eclipse-workspace\\javafundamentals1\\test.csv"));

	            StringBuilder sb = new StringBuilder();
	            sb.append("id");
	            sb.append(',');
	            sb.append("Total");
	            sb.append('\n');
             for(int i=0;i<100;i++)
             {
            	 if(arr[i]!=0)
            	 {
	            sb.append(String.valueOf(i));
	            sb.append(',');
	            sb.append(String.valueOf(arr[i]));
	            sb.append('\n');
             }
             }
	            writer.write(sb.toString());
	            writer.close();
   
	            System.out.println("done!");
	   }catch (Exception e) {  
	        e.printStackTrace();  
	      }
	  
	   
	    }  
   }
