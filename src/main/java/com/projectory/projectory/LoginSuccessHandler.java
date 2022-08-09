package com.projectory.projectory;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.ServletException;
import org.springframework.security.core.Authentication;
import jakarta.servlet.FilterChain;

@Component
class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authentication) throws IOException, ServletException {
		response.setStatus(200);
		// response.setContentType("application/json");
		// PrintWriter w = response.getWriter();
		// w.print(new LoginResponse("success"));
		// w.flush();
		//response.addHeader("Access-Control-Allow-Origin", "*");
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		response.setStatus(200);
		//response.addHeader("Access-Control-Allow-Origin", "*");
	}
}
