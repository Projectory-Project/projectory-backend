package com.projectory.projectory;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users/user")
	public UserResponse current_user() {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		return new UserResponse(SecurityContextHolder.getContext().getAuthentication().getName());
	}
}
