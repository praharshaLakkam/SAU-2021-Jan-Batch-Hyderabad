package com.praharsha;
import javax.xml.bind.*;
import java.io.*;
import com.praharsha.Student;
public class Studentjaxb {
  
   public void unmarshall()
   {
	   try
	   {
		   JAXBContext jc=JAXBContext.newInstance(Student.class);
		   Unmarshaller ums=jc.createUnmarshaller();
		   Student st=(Student) ums.unmarshal(new File("C:\\Users\\ADMIN\\eclipse-workspace\\fundamentals_assign1\\src\\student.xml"));
		   System.out.println("id: "+st.getName()+"\n"+"Programming language: "+st.getPlanguage()+"\n"+"status: "+st.getStatus()+"\n"+"Update"+st.getUpdate());
		   
		   
	
		   
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
}
