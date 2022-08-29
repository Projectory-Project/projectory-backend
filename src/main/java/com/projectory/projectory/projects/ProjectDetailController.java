package com.projectory.projectory.projects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ProjectDetailController {

	@GetMapping("/projects/{owner}/{project_id}")
	public ProjectDetailResponse project_detail(@PathVariable("owner") String owner,
			@PathVariable("project_id") String project_id) {
		ArrayList<ProjectAccessEntry> access = new ArrayList<ProjectAccessEntry>();
		access.add(new ProjectAccessEntry("user_a", "owner"));
		access.add(new ProjectAccessEntry("user_b", "editor"));
		access.add(new ProjectAccessEntry("user_c", "reader"));
		return new ProjectDetailResponse("Name Placeholder", "Description", project_id, owner, "owner", access);
	}
}
