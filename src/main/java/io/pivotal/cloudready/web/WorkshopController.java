package io.pivotal.cloudready.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workshops")
public class WorkshopController {
	
	@RequestMapping(value = "")
	public String index(Model model) {
		return "workshops/index";
	}
	
	@RequestMapping(value = "/cloud-foundry/cli")
	public String cloudFoundryCli(Model model) {
		return "workshops/cloud-foundry/cli";
	}

}
