package com.rsp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rsp.main.model.Employee;

@Controller
@RequestMapping("/api")
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "Home";
	}

	@PostMapping("/add")
	public String registerEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		model.addAttribute("emp", employee);
		return "EmpData";

	}
}
