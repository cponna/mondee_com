    import java.sql.*;
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class Jdbc_demo {
		public static void main(String[] args) throws ClassNotFoundException,SQLException  {
			// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mondee";
	String username="root";
	String password="kumari123";
	Connection connection=DriverManager.getConnection(url, username, password);
	if(connection!=null)
		System.out.println("Connection Established");
	
	Statement st = connection.createStatement();
	int i = st.executeUpdate("insert into sparks values(1041,'varun')");
	if(i != 0)
		System.out.print("Record Inserted!!");	

		}

	}