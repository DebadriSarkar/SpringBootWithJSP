package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "rest")
public class WebController {

	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String getPage() {
		return "home";
	}
	
	@RequestMapping(value = "partials/{page}", method = RequestMethod.GET)
	public String getPages(@PathVariable final String page) {
		return page;
	}
}
