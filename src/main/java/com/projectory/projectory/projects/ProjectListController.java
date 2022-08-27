package com.projectory.projectory.projects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
public class ProjectListController {

	@GetMapping("/project/project_list")
	public ProjectListResponse project_list() {
		ArrayList<ProjectListEntry> project_list = new ArrayList<ProjectListEntry>();
		project_list.add(new ProjectListEntry("Project A", "project_a",
				SecurityContextHolder.getContext().getAuthentication().getName(), "owner"));
		project_list.add(new ProjectListEntry("Project B", "project_b", "xyz", "editor"));
		project_list.add(new ProjectListEntry("Project C", "project_c", "xyz", "reader"));
		return new ProjectListResponse(project_list);
	}
}
