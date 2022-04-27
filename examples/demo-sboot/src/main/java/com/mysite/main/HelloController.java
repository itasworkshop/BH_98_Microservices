package com.mysite.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //@controller + @ResponseBody
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}
	
	@RequestMapping("/tools")
	String myTools() {
		return "Hello from my spring boot Tools application!";
	}
	
	@RequestMapping("/students/{name}/{id}")
	String myStudentIntro(@PathVariable String name,@PathVariable Long id) {
		return "Hello this is "+name +" and my id is "+id;
	}

}
