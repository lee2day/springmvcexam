package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test.model.HelloService;

@Controller
public class HelloWorldController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", helloService.getHello());

		return "helloWorld";
	}


	@RequestMapping("/world")
	public String world(Model model) {
		model.addAttribute("message", helloService.getHello());

		return "world";
	}

	@RequestMapping("/to/bye")
	public String bye(Model model) {
		model.addAttribute("message", helloService.getHello());

		return "bye";
	}
}
