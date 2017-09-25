package my.com.adminpanel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import my.com.adminpanelbackend.dao.LoginDAO;

@Controller
public class PageController {

	@Autowired
	private LoginDAO loginDAO;

	@RequestMapping(value = "/login")
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user", loginDAO.list());
		return mv;

	}
	
	@RequestMapping(value = "/dashboard")
	public ModelAndView dashboard() {

		ModelAndView mv = new ModelAndView("dashboard");
		mv.addObject("", "");
		return mv;

	}


}
