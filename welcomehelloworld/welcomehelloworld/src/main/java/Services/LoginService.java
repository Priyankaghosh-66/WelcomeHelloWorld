package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public String getUserPassword(String username)
	{
		return loginDao.getUserPassword(username);
	}

}
