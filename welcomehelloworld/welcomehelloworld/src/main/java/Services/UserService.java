package Services;

import Models.Users;

public interface UserService {
	void save(Users user);
	
	Users findByUsername(String userName);

}
