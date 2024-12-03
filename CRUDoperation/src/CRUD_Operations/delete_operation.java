package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete_operation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Anu","root","Anu@sql123");
			Statement st = con.createStatement();
			int updatecount = st.executeUpdate("delete from employees where emp_id = 10");
			int updatecount1 = st.executeUpdate("delete from employees where emp_Id = 100");
			
			System.out.println("no.of rows deleted"+updatecount);
			System.out.println("no.of rows deleted"+updatecount1);
			
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println( e);
		}

	}

}
