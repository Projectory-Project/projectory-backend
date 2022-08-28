package com.projectory.projectory.projects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectDetailController {

	@GetMapping("/projects/{owner}/{project_id}")
	public ProjectDetailResponse project_detail(@PathVariable("owner") String owner,
			@PathVariable("project_id") String project_id) {
		return new ProjectDetailResponse("Name Placeholder", "Description", project_id, owner, "owner");
	}
}
