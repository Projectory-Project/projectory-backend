package com.projectory.projectory.projects;

class ProjectAccessEntry {
	private String username, perm;

	public ProjectAccessEntry(String username, String perm) {
		this.username = username;
		this.perm = perm;
	}

	public String getusername() {
		return username;
	}

	public String getperm() {
		return perm;
	}
}
