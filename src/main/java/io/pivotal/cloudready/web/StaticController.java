package io.pivotal.cloudready.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class StaticController {
	
	@RequestMapping(value = "")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/ephemerol")
	public String ephemerol(Model model) {
		return "ephemerol";
	}
	
	@RequestMapping(value = "/spring-initializr")
	public String springInitialzr(Model model) {
		return "spring-initializr";
	}
	
	@RequestMapping(value = "/code-samples")
	public String codeSamples(Model model) {
		return "code-samples";
	}

}
