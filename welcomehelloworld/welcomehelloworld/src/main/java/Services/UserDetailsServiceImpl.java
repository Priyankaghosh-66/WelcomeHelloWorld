package Services;

import org.springframework.beans.factory.annotation.Autowired;

import Models.Users;
import repository.UserRepository;

public class UserDetailsServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users findByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
