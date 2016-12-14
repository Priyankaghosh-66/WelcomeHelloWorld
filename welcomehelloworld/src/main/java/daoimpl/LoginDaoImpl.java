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
	
	public String getUserPassword(String usrname){
		String passwrd;
		Session session=sessionFactory.getCurrentSession();
		List hql=session.createSQLQuery("select USER.password from USER where USER.ID="+usrname).list();
		 passwrd=hql.get(0).toString();
		 return passwrd;
	}
}
