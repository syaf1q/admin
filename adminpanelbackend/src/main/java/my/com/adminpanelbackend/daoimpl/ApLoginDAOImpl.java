package my.com.adminpanelbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import my.com.adminpanelbackend.dao.ApLoginDAO;
import my.com.adminpanelbackend.dto.ApLogin;

@Repository("apLoginDAO")
public class ApLoginDAOImpl implements ApLoginDAO {

	@Override
	public List<ApLogin> list() {

		List<ApLogin> list = new ArrayList<ApLogin>();

		return list;

	}
	
	@Override
	public boolean validateUsernameAndPassword(String username, String password) {

		boolean val = true;

		return val;

	}
}
