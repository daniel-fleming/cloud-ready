package io.pivotal.cloudready.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patterns")
public class PatternController {
	
	@RequestMapping(value = "")
	public String patterns(Model model) {
		return "patterns/index";
	}

}
