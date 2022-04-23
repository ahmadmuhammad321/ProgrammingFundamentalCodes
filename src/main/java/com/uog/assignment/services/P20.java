package com.uog.assignment.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p20")
public class P20 {
	@RequestMapping(method= RequestMethod.GET)
	public List<String> p20(){
		List<String> list = new ArrayList<String>();
		
		String a= "'P'  'A'   'K'";
		
		String b = "'Pakistan'";
		String c= "C:/Windows";
		list.add(c);
		list.add(a);
		list.add(b);
		return list;
	}

}
