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
@RequestMapping("/p3")
public class P3 {
	@RequestMapping(method = RequestMethod.POST)
	public List<Integer> p3(@RequestBody String data){
		List<Integer> list = new ArrayList<Integer>();
		JSONObject obj = new JSONObject(data);
		int a=obj.getInt("x");
		int b=obj.getInt("y");
		int temp=a;
		a=b;
		b=temp;
		list.add(a);
		list.add(b);
		
		return list;
	}

}
