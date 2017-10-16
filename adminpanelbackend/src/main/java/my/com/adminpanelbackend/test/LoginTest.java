package my.com.adminpanelbackend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.com.adminpanelbackend.dao.ApLoginDAO;
import my.com.adminpanelbackend.dto.ApLogin;

public class LoginTest {
	private static AnnotationConfigApplicationContext context;
	private static ApLoginDAO apLoginDAO;
	private ApLogin apLogin;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("my.com.adminpanelbackend");
		context.refresh();
		
	}
	
	@Test
	public void testLogin() {
		
	}
}
