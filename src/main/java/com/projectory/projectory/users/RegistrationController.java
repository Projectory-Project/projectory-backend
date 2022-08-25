package com.projectory.projectory.users;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectory.projectory.auth.WebSecurityConfig;

@RestController
public class RegistrationController {
	@PostMapping("/auth/register")
	public RegistrationResponse registration(@RequestParam String username, @RequestParam String email,
			@RequestParam String password) {
		System.out.println("Registration username " + username + " email " + email + " password " + password);
		UserDetails user = User.withDefaultPasswordEncoder()
				.username(username)
				.password(password)
				.roles("USER")
				.build();
		WebSecurityConfig.user_manager.createUser(user);
		return new RegistrationResponse("success");
	}
}
