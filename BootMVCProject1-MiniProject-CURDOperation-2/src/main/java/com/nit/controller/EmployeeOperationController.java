package com.nit.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@Controller
public class EmployeeOperationController {
	
	@Autowired
	private IEmployeeService empService;
	
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object>map) {
		Iterable<Employee>itEmps=empService.getAllEmployees();
		map.put("empsList",itEmps);
		return "show_employee_report";
	}
	
	@RequestMapping("/emp_add")
	public String  showFormForsaveEmployee(@ModelAttribute("emp")Employee emp) {
		return "register_employee";
	}
	@PostMapping("/emp_add")
	 public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map) {
		 
		String msg=empService.registerEmployee(emp);
		//Iterable<Employee>itEmps=empService.getAllEmployees();
		map.put("resultMsg",msg);
		//map.put("empsList", itEmps);
		return "redirect:emp_report";	
	}
	@RequestMapping("/emp_edit")
	public String showEditEmployeeFromPage(@RequestParam("no")int no,@ModelAttribute("emp")Employee emp) {
		//use service
		Employee emp1=empService.getEmployeeByno(no);
		BeanUtils.copyProperties(emp, emp1);
		return "update_employee";
	}
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp")Employee emp) {
		String msg=empService.updateEmployee(emp);
		attrs.addFlashAttribute("resultMsg",msg);
		
		return"redirect:emp_report";
		
	}
	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs,@RequestParam int no) {
		String msg=empService.deleteEmployeeById(no);
		attrs.addFlashAttribute("resultMsg",msg);
	}
}
