package com.myproject.orm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManyToOneContoller {

	@RequestMapping(value = "many-to-one",method = RequestMethod.GET)
	public String manyToOne()
	{
		//code to add to db
		return "Many To One";
	}
	
	
}
