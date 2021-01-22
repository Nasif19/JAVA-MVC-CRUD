package pg.DAO;

import pg.Models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.web.bind.annotation.RequestMapping;

import pg.Gateway.Gateway;

public class UserDao {
	
	private Connection con;
	public UserDao() {
		con = Gateway.getConnection();
	}
	
	public String addUser(User user) {
		try {
			String query = "INSERT INTO user(name,email,password)"+ " VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();
			return "Save Successful.";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}

	}
}
