package my.com.adminpanelbackend.dao;

import java.util.List;

import my.com.adminpanelbackend.dto.ApLogin;

public interface ApLoginDAO {
	
	List<ApLogin> list();
	boolean validateUsernameAndPassword(String username, String password);
	
}
