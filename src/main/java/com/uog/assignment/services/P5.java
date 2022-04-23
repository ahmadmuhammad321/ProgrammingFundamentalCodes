package com.uog.assignment.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p5")
public class P5 {
	@RequestMapping(method = RequestMethod.POST)
	public List<Integer> p5(@RequestBody String data){
		List<Integer> list = new ArrayList<Integer>();
		JSONObject obj = new JSONObject(data);
		int a=obj.getInt("x");
		int b=obj.getInt("y");
		int sum=a+b;
		int product=a*b;
		list.add(sum);
		list.add(product);
		
		return list;
	}

}
