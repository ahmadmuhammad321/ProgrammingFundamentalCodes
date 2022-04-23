package com.uog.assignment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p1")
public class P1 {
	@RequestMapping(method=RequestMethod.GET)
	public List<Integer> p1(){
		List<Integer> list = new ArrayList<Integer>();
		int a=20;
		int b=30;
		int c=40;
		list.add(a);
		list.add(b);
		list.add(c);
		return list;
	}

}