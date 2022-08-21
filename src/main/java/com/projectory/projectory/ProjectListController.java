package com.projectory.projectory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ProjectListController {

	@GetMapping("/project/project_list")
	public ProjectListResponse project_list() {
		ArrayList<ProjectListEntry> project_list = new ArrayList<ProjectListEntry>();
		project_list.add(new ProjectListEntry("Project A", "pa"));
		project_list.add(new ProjectListEntry("Project B", "pb"));
		project_list.add(new ProjectListEntry("Project C", "pc"));
		return new ProjectListResponse(project_list);
	}
}
