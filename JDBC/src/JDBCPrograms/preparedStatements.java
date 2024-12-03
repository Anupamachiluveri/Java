package JDBCPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class preparedStatements {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anupama","root","Anupama@258");
				PreparedStatement pst = con.prepareStatement("insert into employees values (?,?,?,?)");
				pst.setInt(1, 104);
				pst.setString(2, "anupama");
				pst.setString(3,"chiliveri");
				pst.setDouble(4,50000);
				pst.executeUpdate();
				System.out.println("rows inserted successfully");
				pst.setInt(1, 105);
				pst.setString(2, "aparna");
				pst.setString(3,"kolluri");
				pst.setDouble(4,80000);
				pst.executeUpdate();
				System.out.println("rows inserted successfully");
			} catch (Exception e) {	
				System.out.println(e);
			}
		}
		}




