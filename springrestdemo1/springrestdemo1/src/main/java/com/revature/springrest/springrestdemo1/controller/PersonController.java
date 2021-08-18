package com.revature.springrest.springrestdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {
	
	@RequestMapping(value="/details",method=RequestMethod.GET)
	@ResponseBody
	public String getEmi() {
		return "Person details"; //jsp
	}

}
