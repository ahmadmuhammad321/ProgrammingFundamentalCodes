package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p4")
public class P4 {
	@RequestMapping(method= RequestMethod.POST)
	public int p4(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		int year= obj.getInt("year");
		
		int months = year*12;
		return months;
	}

}
