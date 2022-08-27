package com.projectory.projectory.projects;

class ProjectListEntry {
	private String project_name, id, owner, perm;

	public ProjectListEntry(String name, String id, String owner, String perm) {
		this.project_name = name;
		this.id = id;
		this.owner = owner;
		this.perm = perm;
	}

	public String getproject_name() {
		return project_name;
	}

	public String getid() {
		return id;
	}

	public String getowner() {
		return owner;
	}

	public String getperm() {
		return perm;
	}
}
