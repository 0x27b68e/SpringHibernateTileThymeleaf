package com.example.demo;

import java.lang.Thread.State;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@Autowired
	private Student student;
	
	/*@RequestMapping(value = "/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("hello world", HttpStatus.OK);
	}*/
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "home";
	}
	
	@RequestMapping(value = "/home_thymeleaf")
	public String home_thymeleaf(Locale locale, Model model) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(date);
		
		model.addAttribute("serveTime", format);
		return "home_thymeleaf";
	}
	
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/students")
	public String students(Model model){
		
		model.addAttribute("student_name", student.getName() );
		model.addAttribute("student_clazz", student.getClazz());
		model.addAttribute("student_scores", student.getScores());
		
		model.addAttribute("student_address_street", student.getAddress().getStreet());
		model.addAttribute("student_address_city", student.getAddress().getCity());
		
		
		return "students";
	}

}
