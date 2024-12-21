package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.binders.StudentFormBinders;
import com.nit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/loadform")
	public String loadForm(Model model ) {
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTimings());
		
		StudentFormBinders binders = new StudentFormBinders();
		model.addAttribute("binders", binders);
		return "index";
	}
	
	
}
