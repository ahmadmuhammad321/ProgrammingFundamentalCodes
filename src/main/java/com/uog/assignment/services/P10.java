package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p10")
public class P10 {
	@RequestMapping(method= RequestMethod.POST)
	public double p10(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double miles= obj.getInt("miles");
		
		double KMs = miles*1.609;
		return KMs;
	}

}
