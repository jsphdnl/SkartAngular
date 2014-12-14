package com.spinhighq.skart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String login() {

		return "hellotesting";

	}
}
