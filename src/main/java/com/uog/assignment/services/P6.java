package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p6")
public class P6 {
	@RequestMapping(method= RequestMethod.POST)
	public int p6(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		int age= obj.getInt("Age");
		
		int age_months = age*12;
		return age_months;
	}

}
