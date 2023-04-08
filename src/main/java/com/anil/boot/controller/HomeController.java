package com.anil.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/admin")
	public String getAdmin() {
		return "This is the admin access...";
	}

	@GetMapping("/public")
	public String getPublic() {
		return "This is the public access...";
	}

	@GetMapping("/private")
	public String getPrivate() {
		return "This is the privaste access...";
	}
}
