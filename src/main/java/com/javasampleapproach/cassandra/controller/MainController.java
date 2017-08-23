package com.javasampleapproach.cassandra.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {
	
	@RequestMapping(value="/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}
