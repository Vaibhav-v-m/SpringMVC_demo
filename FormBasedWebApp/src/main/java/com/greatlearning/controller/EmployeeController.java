package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel) {
		
		Employee employee = new Employee();
		
		theModel.addAttribute("employeeModel", employee);
		
		return "employee-Form";
	}
	

	
}
