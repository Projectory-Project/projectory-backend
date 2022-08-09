package com.projectory.projectory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	//UsernamePasswordAuthenticationFilter upaf = new UsernamePasswordAuthenticationFilter();

	@PostMapping("/auth/login")
	public LoginResponse login(@RequestParam String username, @RequestParam String password) {
		System.out.println("Login attempt username " + username + " password " + password);
		//upaf.attemptAuthentication(http)
		return new LoginResponse("success");
	}
}
