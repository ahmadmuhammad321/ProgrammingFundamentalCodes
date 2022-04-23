package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p18")
public class P18 {
	@RequestMapping(method = RequestMethod.POST)
	public double p18(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double vi=obj.getInt("vi");
		double t=obj.getInt("t");
		double a=obj.getInt("a");
		
		double S=(vi*t)+(0.5*(a*t*t));
		
		
		return S;
	}

}
