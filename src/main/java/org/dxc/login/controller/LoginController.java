package org.dxc.login.controller;

import java.util.Date;
import java.util.logging.Logger;

import org.dxc.login.model.LoginBean;
import org.dxc.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	public Logger logger=Logger.getLogger(LoginController.class.getName());
	@RequestMapping("/")
	public String showIndexPage(Model model) {
		logger.info("=======================showIndexPage");
		model.addAttribute("date", new Date());
		return "index";
		
	}
	@RequestMapping("/addlogin")
	public String showaddLogin(@ModelAttribute("login")LoginBean loginBean) {
		logger.info("======showaddloginPage");
	  return "addlogin";
		
	}
	
	
@RequestMapping(value="/submitlogin",method=RequestMethod.POST)
public String checkValidateLogin(@ModelAttribute("login")LoginBean loginBean,BindingResult result,Model model) {
	if(loginService.validate(loginBean)==true) {
		logger.info("======showaddnewloginPage");
		 return "success";
	}
	else {
		logger.info("======showaddnewProductPage");
		return "invalid";
	}
}
	
}
