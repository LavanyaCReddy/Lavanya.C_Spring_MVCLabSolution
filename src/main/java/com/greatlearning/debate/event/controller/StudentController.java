package com.greatlearning.debate.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.greatlearning.debate.event.entity.Student;
import com.greatlearning.debate.event.service.IStudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	
	
	@Autowired
	private IStudentService studentService;
	@RequestMapping(method = RequestMethod.GET, path = "/show-form")
	public String showFormToUser() {
		return "welcome";
	}
	

	@RequestMapping(method = RequestMethod.POST, path = "/new-student")
	public String addStudentDetails(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("country") String country) {
		Student student = new Student(id, name, department, country);
		studentService.add(student);

		return "redirect:show-students";
	}
	
	

}
