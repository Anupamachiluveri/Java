package JDBCPrograms;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	public class createTable {
		public static void main(String[] args) {
			String DriverName = "com.mysql.cj.jdbc.Driver";
			String DriverURL = "jdbc:mysql://localhost:3306/Anupama";
			String userName = "root";
			String userPassward = "Anupama@258";
			String sql_Query = "create table employee(emp_Id int primary key ,emp_lastName varchar(20),emp_firstName varchar(20),emp_salary double)";
			try {
				Class.forName(DriverName);
				Connection con = DriverManager.getConnection(DriverURL,userName,userPassward);
				Statement st = con.createStatement();
				st.executeUpdate(sql_Query);
				System.out.println("table is created");
				con.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}



		}







			


