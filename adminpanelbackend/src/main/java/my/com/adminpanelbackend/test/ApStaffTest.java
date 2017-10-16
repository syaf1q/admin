package my.com.adminpanelbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.com.adminpanelbackend.dao.ApStaffDAO;
import my.com.adminpanelbackend.dto.ApStaff;

public class ApStaffTest {
	private static AnnotationConfigApplicationContext context;
	private static ApStaffDAO apStaffDAO;
	private ApStaff apStaff;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("my.com.adminpanelbackend");
		context.refresh();
		apStaffDAO = (ApStaffDAO) context.getBean("apStaffDAO");

	}

	/*
	 * @Test public void addStaff() {
	 * 
	 * ApStaff apStaff = new ApStaff();
	 * 
	 * apStaff.setName("Mohd Syafiq bin Adam"); apStaff.setStaffCode("001");
	 * apStaff.setNoKp(11); apStaff.setGender(1); apStaff.setDob(new Date());
	 * apStaff.setAddress("Sejambak 2"); apStaff.setActive(1);
	 * 
	 * assertEquals("Insert", true, apStaffDAO.addStaff(apStaff)); }
	 */

	/*
	 * @Test public void getStaff() {
	 * 
	 * apStaff = apStaffDAO.getStaff(1); assertEquals("Get", "Mohd Syafiq bin Adam",
	 * apStaff.getName()); }
	 */

	/*
	 * @Test public void updateStaff() {
	 * 
	 * apStaff = apStaffDAO.getStaff(1); apStaff.setAddress("Sejambak 3");
	 * 
	 * assertEquals("Update", true, apStaffDAO.updateStaff(apStaff)); }
	 */

	/*
	 * @Test public void deleteStaff() {
	 * 
	 * apStaff = apStaffDAO.getStaff(1); apStaff.setActive(0);
	 * 
	 * assertEquals("Delete", true, apStaffDAO.deleteStaff(apStaff)); }
	 */

	/*
	 * @Test public void listStaff() {
	 * 
	 * assertEquals("List", 1, apStaffDAO.list().size()); }
	 */
	
	

}
