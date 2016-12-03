package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Products;
import Models.User;
import dao.UserDAO;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	public void addUser(User u) {
		// TODO Auto-generated method stub
		this.userDAO.addUser(u);
	}

	public void updateUser(User u) {
		this.userDAO.updateUser(u);
		// TODO Auto-generated method stub
		
	}

	public List<User> listUsers() {
		
		// TODO Auto-generated method stub
		return this.userDAO.listUsers();
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDAO.getUserById(id);
	}

	public void removeUser(int id) {
		this.userDAO.removeUser(id);
		// TODO Auto-generated method stub
		
	}
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDAO.viewUser();
	}

}
