package com.projectory.projectory;

public class ServerVersionResponse {
	private String version_string;

	public ServerVersionResponse(String version_string) {
		this.version_string = version_string;
	}

	/*
	 * public void setVersionString(String s){
	 * version_string = s;
	 * }
	 */

	public String getversion_string() {
		return version_string;
	}
}
