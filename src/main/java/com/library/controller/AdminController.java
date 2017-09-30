package com.library.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Secured("ADMIN")
public class AdminController {

	@RequestMapping(path="admin", method=RequestMethod.GET)
	public String hello() {
		return "This is Admin controller";
	}
}
