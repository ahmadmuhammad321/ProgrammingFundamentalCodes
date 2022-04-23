package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p13")
public class P13 {
	@RequestMapping(method = RequestMethod.POST)
	public double p13(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double R=obj.getInt("R");
		double pi= 3.1417;
		double area=pi*R*R;
		
		
		return area;
	}

}