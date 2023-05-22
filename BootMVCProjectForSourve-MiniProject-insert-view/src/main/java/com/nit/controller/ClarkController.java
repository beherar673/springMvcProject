package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.entity.Clark;
import com.nit.service.IClarkService;

@Controller()
public class ClarkController {

	@Autowired
	private IClarkService ick;
	
	@RequestMapping("/clark")
	public String showPage() {
		return "home";
	}
	
	@RequestMapping("/save")
	public String resisterClark(@ModelAttribute("clk")Clark clk){
	return "register_clark";
    }
	@RequestMapping("/saveAll")
    public String resisterClark(@ModelAttribute ("clk")Clark clk,Map<String,Object>map) {
    	String msg=ick.insertClark(clk);
    	map.put("clkvalue",msg);
	return "redirect:show_register_clark";
    }
	
	
	 @RequestMapping("/showAllData")
	    public String select(Map<String,Object>map) {
	    	Iterable<Clark>clk=ick.getAllClark();
	    	map.put("itclark", clk);
	    	return "showregisterclark";
	    }
}
