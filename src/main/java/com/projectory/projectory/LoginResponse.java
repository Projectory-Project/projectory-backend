package com.projectory.projectory;

public class LoginResponse {
	private final String status;

	public LoginResponse(String status) {
		this.status = status;
	}

	public String getstatus() {
		return status;
	}
}
