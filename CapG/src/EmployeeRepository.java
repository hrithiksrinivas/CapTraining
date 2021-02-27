
import java.sql.*;

public class EmployeeRepository {

	public static void main(String[] args) {
		
		try {
//			1. Load the driver
			Class.forName("org.postgresql.Driver");  
			
//			2. Create a connection to database
			Connection con=DriverManager.getConnection(  
					"jdbc:postgresql://localhost:5432/capdb","postgres","hrithik30");  
			System.out.println("Connected to database");
			
//			3. Fire a sql query
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM public.employees");  
			System.out.println("Details....");
//			4. Extract the result from query
//			System.out.println(rs.getFetchSize());
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getInt(3));  
			
//			5. Close the connection to database
			con.close();  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		
	}

}