package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Models.User;
import dao.UserDAO;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	private static final Logger logger=LoggerFactory.getLogger(UserDAO.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User u) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("User Registered Successfully,user details="+u);
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User u) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("User Updated Successfully,User Details="+u);
		// TODO Auto-generated method stub
		
	}

	public List<User> listUsers() {
		Session session=this.sessionFactory.getCurrentSession();
		List<User>userList=session.createQuery("from User").list();
		for(User u:userList){
			logger.info("UserList::"+u);
		}
		return userList;
		// TODO Auto-generated method stub
	}

	public User getUserById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		User u=(User) session.load(User.class, new Integer(id));
		logger.info("User Loaded successfully,User Details="+u);
		// TODO Auto-generated method stub
		return u;
	}

	public void removeUser(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		User u=(User) session.load(User.class,new Integer (id));
		if(null!=u){
			session.delete(u);
		}
		logger.info("User Deleted Successfully,User details:"+u);
		// TODO Auto-generated method stub
		
	}

	public List<User> viewUser() {

		Session session = sessionFactory.openSession();
        List<User> userList = session.createQuery("from User").list();
		return userList;
	}
	/*public List<User> detailsUser(int id){
		Session session=sessionFactory.getCurrentSession();
		List<User>thatUser=(List<User>)session.createSQLQuery("select * from USER where USER.id="+id).addEntity(User.class).list();
		return thatUser;
	}
*/
	/*public List<User> detailsUser(String userId) {

		Session session=sessionFactory.getCurrentSession();
		List<User>thatUser=(List<User>)session.createSQLQuery("select USER.username from USER where USER.id IS NOT "+userId).list();
		return thatUser;
	}*/
}
