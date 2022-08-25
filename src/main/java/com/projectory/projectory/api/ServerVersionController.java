package com.projectory.projectory.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerVersionController {

	@RequestMapping(value = "/server_version", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ServerVersionResponse server_version() {
		return new ServerVersionResponse("alpha");
	}
}
