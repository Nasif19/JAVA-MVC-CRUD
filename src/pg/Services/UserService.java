package pg.Services;

import java.math.BigInteger;
import java.util.List;

import pg.Models.User;

public interface UserService {
	
	public void addUser(User user);
	public List<User> getUsers();
	public void deleteUser(BigInteger id);
	public User getUser(BigInteger id);
	public User updateUser(User user);
}
