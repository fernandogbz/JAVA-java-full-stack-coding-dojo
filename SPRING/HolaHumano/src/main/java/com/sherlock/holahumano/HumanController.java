package com.sherlock.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String human(@RequestParam(value="name", required=false) String name, @RequestParam(value="last-name", required=false) String lastName) {
		if(name == null) {
			return "Hello human! Welcome to SpringBoot!";
		}
		return "Hello " + name + " " + (lastName != null ? lastName : "") + " Welcome to SpringBoot!";
	}
}
