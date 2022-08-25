package com.projectory.projectory.projects;

class ProjectListEntry {
	private String project_name, id;

	public ProjectListEntry(String name, String id) {
		this.project_name = name;
		this.id = id;
	}

	public String getproject_name() {
		return project_name;
	}

	public String getid() {
		return id;
	}
}
