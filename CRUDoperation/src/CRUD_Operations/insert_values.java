package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_values {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Anu","root","Anu@sql123");
				Statement st = con.createStatement();
				int updatecount = st.executeUpdate("insert into employees values(101,'sharadha','choppari',20000)");
				int updatecount1 = st.executeUpdate("insert into employees values(102,'uma','koppu',50000)");
				int updatecount2 = st.executeUpdate("insert into employees values(103,'swapna','chiluveri',40000)");
				System.out.println("no.of rows inserted"+updatecount);
				System.out.println("no.of rows inserted"+updatecount1);
				System.out.println("no.of rows inserted"+updatecount2);
				con.close();	
			}
			catch(Exception e)
			{
				System.out.println( e);
			}

	}

}


