package com.in28Mintues.springboot.myfirstwebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
	//Say-hello = "Hello!! What are you learning today???"
	
	@RequestMapping("say-hello-jsp")
	public String sayHello() {
		return "sayHello";
	}
}
