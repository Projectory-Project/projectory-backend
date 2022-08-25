package com.projectory.projectory.api;

public class ServerVersionResponse {
	private String version_string;

	public ServerVersionResponse(String version_string) {
		this.version_string = version_string;
	}

	public String getversion_string() {
		return version_string;
	}
}
