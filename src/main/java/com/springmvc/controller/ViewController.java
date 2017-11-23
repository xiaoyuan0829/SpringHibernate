package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;
import com.springmvc.service.ViewService;

@Controller
public class ViewController {
	
	@Autowired
	private ViewService viewService;
	
	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	public ModelAndView HelloController(){
		List<User> list = viewService.queryUser();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String helloUser(@ModelAttribute() User user){
		viewService.addUserService(user);
		return "redirect:/queryAll";
	}
	
	@RequestMapping("/delUser/{id}")
	public String delUser(@PathVariable("id") Integer id){
		viewService.delUser(id);
		return "redirect:/queryAll";
	}
	
}
