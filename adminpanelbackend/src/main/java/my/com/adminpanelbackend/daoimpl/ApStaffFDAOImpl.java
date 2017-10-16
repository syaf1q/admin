package my.com.adminpanelbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import my.com.adminpanelbackend.dao.ApStaffDAO;
import my.com.adminpanelbackend.dto.ApStaff;

@Repository("apStaffDAO")
@Transactional
public class ApStaffFDAOImpl implements ApStaffDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addStaff(ApStaff apStaff) {
		try {

			sessionFactory.getCurrentSession().persist(apStaff);

			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStaff(ApStaff apStaff) {
		try {

			sessionFactory.getCurrentSession().update(apStaff);

			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStaff(ApStaff apStaff) {
		try {

			sessionFactory.getCurrentSession().update(apStaff);

			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	/* Getting single category */
	@Override
	public ApStaff getStaff(int id) {
		return sessionFactory.getCurrentSession().get(ApStaff.class, Integer.valueOf(id));
	}

	@Override
	public List<ApStaff> list() {

		String selectActiveStaff = "FROM ap_staff WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveStaff);
		query.setParameter("active", 1);

		return query.getResultList();
	}

}
