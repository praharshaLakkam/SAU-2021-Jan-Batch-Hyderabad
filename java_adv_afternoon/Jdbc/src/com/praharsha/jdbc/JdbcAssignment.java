package com.praharsha.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class JdbcAssignment {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "oracle");
		Statement st=con.createStatement();
	      
	     
	      String sql = "INSERT INTO Students " +
	                   "VALUES (5, 'Zaid', 30,'2345678901')";
	      st.executeUpdate(sql);
	      sql = "INSERT INTO Students " +
	                   "VALUES(6, 'hary', 28,'9876056050')";
	      st.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");

		ResultSet rs= st.executeQuery("select * from students");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
		}
		con.close();
	}catch (Exception e)
		{
		   System.out.println(e);
		}
		
	}

}
