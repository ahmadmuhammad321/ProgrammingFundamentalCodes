package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p14")
public class P14 {
	@RequestMapping(method = RequestMethod.POST)
	public double p14(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double mm=obj.getInt("mm");
		double inches=mm*0.3937;
		
		
		return inches;
	}

}