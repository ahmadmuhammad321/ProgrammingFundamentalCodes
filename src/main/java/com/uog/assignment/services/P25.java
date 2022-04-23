package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p25")
public class P25 {
	@RequestMapping(method= RequestMethod.POST)
	public double p25(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double a= obj.getDouble("a");
		double b= obj.getDouble("b");
		double c= obj.getDouble("c");
		double s= (a+b+c)/2;
		double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		
		
		return area;
	}

}
