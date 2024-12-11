package JDBCPrograms;
	import java.sql.*;
			public class JDBCpractice {
				public static void main(String[] args) throws ClassNotFoundException, SQLException{
					//register the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					//get the connection
					Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anupama","root","Anupama@258");
					//create statement object
					System.out.println("connection created");
					//execute the query
					Statement stmt = Con.createStatement();
					stmt.executeUpdate("insert into student (roll,Name) values(1,'anu')");
					stmt.executeUpdate("insert into student (roll,Name) values(2,'chitti')");
				ResultSet res =	stmt.executeQuery("select * from student");
				while(res.next()) {
					System.out.println(res.getInt(1)  + res.getString(2));
					System.out.println(res.getString(2));
				}
					//close the connection
			Con.close();
		}
}