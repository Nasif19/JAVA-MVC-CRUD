package pg.Gateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Gateway {
	private static Connection con = null;
	
	public static Connection getConnection()
	{
		if (con != null) 
		{
			return con;
		} 
		else 
		{
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
				String connectionUrl = "jdbc:sqlserver://NS-PC;database=spring_crud_db;integratedSecurity=true;"; 
				con = DriverManager.getConnection(connectionUrl);  
			}
			catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe);
            } catch (SQLException sqe) {
                System.out.println(sqe);
            }
			
			return con;
		}
		
			
	}
}
