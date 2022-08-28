package com.projectory.projectory.projects;

class ProjectDetailResponse {
	private String project_name, description, id, owner, current_perm;

	public ProjectDetailResponse(String name, String description, String id, String owner, String perm) {
		this.project_name = name;
		this.description = description;
		this.id = id;
		this.owner = owner;
		this.current_perm = perm;
	}

	public String getproject_name() {
		return project_name;
	}

	public String getdescription() {
		return description;
	}

	public String getid() {
		return id;
	}

	public String getowner() {
		return owner;
	}

	public String getcurrent_perm() {
		return current_perm;
	}
}
