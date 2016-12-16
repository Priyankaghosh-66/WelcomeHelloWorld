package Services;

import java.util.List;

import Models.User;

public interface UserService {

	public void addUser(User u);
	public void updateUser(User u);
	public List<User>listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public List<User>getAll();
	/*public List<User> detailsUser(String userId);*/
}
