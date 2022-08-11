package com.projectory.projectory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurityConfig {
	public static InMemoryUserDetailsManager user_manager = new InMemoryUserDetailsManager();

	WebSecurityConfig() {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER")
				.build();
		user_manager.createUser(user);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.cors().disable();
		http.addFilterAt(new UsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/server_version").permitAll()
				.antMatchers(HttpMethod.POST, "/auth/login", "/auth/register").permitAll()
				.antMatchers(HttpMethod.GET, "/user").hasRole("USER")
				.anyRequest().authenticated()
				.and()
				.formLogin().loginProcessingUrl("/testlogin").usernameParameter("username")
				.passwordParameter("password")
				.successHandler(new LoginSuccessHandler()).failureHandler(new LoginFailtureHandler())
				.and()
				.logout().logoutUrl("/auth/logout").permitAll();
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailService() {
		return user_manager;
	}

}
