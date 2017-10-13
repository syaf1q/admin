package my.com.adminpanel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import my.com.adminpanelbackend.dto.ApLogin;

@Controller
public class PageController {

	@Autowired
	private ApLogin apLogin;

	@RequestMapping(value = "/login")
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user", "");
		return mv;

	}
	
	@RequestMapping(value = "/dashboard")
	public ModelAndView dashboard() {

		ModelAndView mv = new ModelAndView("dashboard");
		mv.addObject("", "");
		return mv;

	}


}
