package com.projectory.projectory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	@GetMapping("/auth/register")
	public RegistrationResponse registration(@RequestParam String username, @RequestParam String password) {
		System.out.println("Registration username " + username + " password " + password);
		return new RegistrationResponse("success");
	}
}
