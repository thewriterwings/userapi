package com.thewriterwings.userapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {
	
	@GetMapping(value="/home")
	public String goHome() {
		return "Hey ! I am on home page.";
	}

}
