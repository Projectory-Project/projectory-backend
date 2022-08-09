package com.projectory.projectory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String current_user() {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
}
