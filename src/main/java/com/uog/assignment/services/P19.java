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
@RequestMapping("/p19")
public class P19 {
	@RequestMapping(method= RequestMethod.POST)
	public List<Integer> p19(@RequestBody String data){
		List<Integer> list = new ArrayList<Integer>();
		JSONObject obj = new JSONObject(data);
		int age= obj.getInt("Age");
		
		int age_months = age*12;
		int age_days= age*12*30;
		list.add(age_months);
		list.add(age_days);
		return list;
	}

}
