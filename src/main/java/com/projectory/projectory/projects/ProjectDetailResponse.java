package com.projectory.projectory.projects;

import java.util.ArrayList;

class ProjectDetailResponse {
	private String project_name, description, id, owner, current_perm;
	ArrayList<ProjectAccessEntry> access;

	public ProjectDetailResponse(String name, String description, String id, String owner, String perm,
			ArrayList<ProjectAccessEntry> access) {
		this.project_name = name;
		this.description = description;
		this.id = id;
		this.owner = owner;
		this.current_perm = perm;
		this.access = access;
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

	public ArrayList<ProjectAccessEntry> getaccess() {
		return access;
	}
}
