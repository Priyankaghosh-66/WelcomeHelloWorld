package daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Models.CustomerOrder;
import dao.CustomerOrderDAO;
@Repository
@Transactional
public class CustomerOrderDAOImpl implements CustomerOrderDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addCustomerOrder(CustomerOrder customerOrder) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(customerOrder);
		session.flush();
		session.close();
		
		// TODO Auto-generated method stub
		
	}

}
