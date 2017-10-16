package my.com.adminpanel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import my.com.adminpanelbackend.daoimpl.ApLoginDAOImpl;

@Controller
public class LoginController {
	
	@Autowired
	private ApLoginDAOImpl apLogin;
	
	@RequestMapping(value = "/loginProcess")
	public ModelAndView loginProcess() {
		
		String username = "admin";
		String password = "12qwaszx!@";
		
		ModelAndView mv = new ModelAndView("dashboard");
		mv.addObject("apLogin", apLogin.validateUsernameAndPassword(username, password));
		return mv;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("","");
		
		return mv;
	}
	
}
