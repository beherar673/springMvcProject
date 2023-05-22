package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.entity.Student;
import com.nit.service.IStudentService;

@Controller()
public class StudentController {

	@Autowired
	private IStudentService istd;
	
    @RequestMapping("/home")
	public String showHome() {
		return "home";
	}
    
    @RequestMapping("/save")
    	public String resisterStudent(@ModelAttribute("std")Student std){
    	return "register_student";
    }
    @RequestMapping("/saveAll")
    public String resisterStudent(@ModelAttribute ("std")Student std,Map<String,Object>map) {
    	String msg=istd.register(std);
    	map.put("stvalue", msg);
	return "redirect:show_register_student";
    }
    
    @RequestMapping("/showAllData")
    public String select(Map<String,Object>map) {
    	Iterable<Student>sel=istd.getAllStudent();
    	map.put("itsel", sel);
    	return "showregisterstudent";
    }

}
