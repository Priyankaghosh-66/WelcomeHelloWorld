package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.LoginDao;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public String getUserPassword(String username){
		String password;
		username="'"+username+"'";
		Session session=sessionFactory.getCurrentSession();
		List hql=session.createSQLQuery("select USER.password from USER where USER.USERNAME="+username).list();
		 password=hql.get(0).toString();
		 return password;
	}
}
