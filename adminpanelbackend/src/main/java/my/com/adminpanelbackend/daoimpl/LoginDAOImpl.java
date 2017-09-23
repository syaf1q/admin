package my.com.adminpanelbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import my.com.adminpanelbackend.dao.LoginDAO;
import my.com.adminpanelbackend.dto.Login;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

	private static List<Login> listAll = new ArrayList<>();

	static {

		Login login = new Login();
		login.setId(1);
		login.setEmail("msyafiq.adam@gmail.com");
		login.setPassword("123456");
		login.setActive(true);
		listAll.add(login);

	}

	@Override
	public List<Login> list() {
		// TODO Auto-generated method stub
		return listAll;
	}

}
