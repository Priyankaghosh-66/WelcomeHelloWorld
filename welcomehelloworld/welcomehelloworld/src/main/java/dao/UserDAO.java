package dao;

import java.util.List;

import Models.Products;
import Models.User;

public interface UserDAO {

	public void addUser(User u);
	public void updateUser(User u);
	public List<User>listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public List<User> viewUser();
	
}
