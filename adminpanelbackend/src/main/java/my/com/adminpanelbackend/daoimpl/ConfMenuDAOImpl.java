package my.com.adminpanelbackend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import my.com.adminpanelbackend.dao.ConfMenuDAO;
import my.com.adminpanelbackend.dto.ConfMenu;

@Repository("confMenuDAO")
public class ConfMenuDAOImpl implements ConfMenuDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean add(ConfMenu confMenu) {
		try {
			
			sessionFactory.getCurrentSession().persist(confMenu);
			
			return true;
		}catch(Exception ex) {
			
			ex.printStackTrace();
			return false;
		}

	}

}
