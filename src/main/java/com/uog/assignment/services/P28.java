package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p28")
public class P28 {
	@RequestMapping(method= RequestMethod.POST)
	public double p28(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double a= obj.getInt("a");
		double b= obj.getInt("b");
		double c= obj.getInt("c");
		
		double disc = (b*b)-4*a*c;
		
		return disc;
	}

}
