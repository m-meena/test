package com.niit.loginRegisterDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView index1()
	{
		return new ModelAndView("index");
	}

}
