package my.com.adminpanelbackend.dao;

import java.util.List;

import my.com.adminpanelbackend.dto.ApStaff;

public interface ApStaffDAO {

	List<ApStaff> list();

	ApStaff getStaff(int id);

	boolean addStaff(ApStaff apStaff);

	boolean deleteStaff(ApStaff apStaff);

	boolean updateStaff(ApStaff apStaff);
}
