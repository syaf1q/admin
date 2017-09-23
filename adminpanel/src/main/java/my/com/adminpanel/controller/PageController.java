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

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome To Spring");
		return mv;

	}

	@RequestMapping(value = "/login")
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user", loginDAO.list());
		return mv;

	}

	// @RequestMapping(value = "/testrequestparam")
	// public ModelAndView testrequestparam(@RequestParam(value = "greeting",
	// required = true) String greeting) {
	//
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	//
	// }
	//
	// @RequestMapping(value = "/testpathvariable/${greeting}")
	// public ModelAndView test(@PathVariable("greeting") String greeting) {
	//
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	//
	// }

}
