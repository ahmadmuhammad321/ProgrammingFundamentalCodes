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
@RequestMapping("/p22")
public class P22 {
	@RequestMapping(method= RequestMethod.POST)
	public List<String> p22(@RequestBody String data){
		List<String> list = new ArrayList<String>();
		JSONObject obj = new JSONObject(data);
		String name= obj.getString("Name");
		String age= obj.getString("Age");
		String gender= obj.getString("Gender");
		String height= obj.getString("Height");
		
		list.add(name);
		list.add(age);
		list.add(gender);
		list.add(height);
		return list;
	}

}
