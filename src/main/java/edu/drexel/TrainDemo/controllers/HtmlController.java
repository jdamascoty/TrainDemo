package edu.drexel.TrainDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

	@GetMapping("/Test")
	public String test() {
		return "Test.html";
	}

}
