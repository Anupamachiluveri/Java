package jdbcConnectionToDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class jdbcConnection {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/db","root","Anu@sql123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employess");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getDouble(3));

			}
			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}
}
