package com.projectory.projectory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.cors().disable();
		http.addFilterBefore(new UsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
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
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("u")
				.password("p")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
}