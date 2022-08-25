package com.projectory.projectory.projects;

import java.util.ArrayList;

public class ProjectListResponse {
	private ArrayList<ProjectListEntry> project_list;

	public ProjectListResponse(ArrayList<ProjectListEntry> list) {
		this.project_list = list;
	}

	public ArrayList<ProjectListEntry> getproject_list() {
		return project_list;
	}
}
