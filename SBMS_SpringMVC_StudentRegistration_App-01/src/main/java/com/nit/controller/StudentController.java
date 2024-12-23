package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.binders.StudentFormBinders;
import com.nit.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	

	@GetMapping("/loadform")
	public String loadForm( Model model ,@ModelAttribute("student")StudentFormBinders binders ) {
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTimings());
		
		//StudentFormBinders student = new StudentFormBinders();
		//model.addAttribute("binders", student);  //when @ModelAttribute is used
		return "index";                             //then again creating is optional here
	}
	@PostMapping("/saveDetails")
	public String handleForm(Model model,StudentFormBinders studentFormBinders) {
		System.out.println(studentFormBinders);
		studentService.saveData(studentFormBinders);
		model.addAttribute("msg","Registration Successful");
		return "success";
	}
	
	/*@GetMapping("/")
	public ResponseEntity<String> getMethodName() {
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}*/
}
