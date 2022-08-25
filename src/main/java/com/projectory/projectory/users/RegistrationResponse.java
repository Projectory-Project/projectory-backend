package com.projectory.projectory.users;

public class RegistrationResponse {
	private final String status;

	public RegistrationResponse(String status) {
		this.status = status;
	}

	public String getstatus() {
		return status;
	}
}
