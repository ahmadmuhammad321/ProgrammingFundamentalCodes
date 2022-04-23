package com.uog.assignment.services;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p2")
public class P2 {
	@RequestMapping(method=RequestMethod.GET)
	public String p2(){
		return "Java is a powerful programming Language";
	}

}
