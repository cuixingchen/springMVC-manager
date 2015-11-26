package com.cui.manager.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = { "/userPage.html" }, method = { RequestMethod.GET })
	public String getUserPage() {
		
		
		return null;
	}

}
