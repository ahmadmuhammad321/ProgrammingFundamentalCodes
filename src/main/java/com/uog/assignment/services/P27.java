package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p27")
public class P27 {
	@RequestMapping(method= RequestMethod.POST)
	public double p27(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double hours= obj.getInt("hours");
		double mins= obj.getInt("minutes");
		double secs= obj.getInt("seconds");
		
		double minutes = (hours*60)+mins;
		double seconds = (minutes*60)+secs;
		return seconds;
	}

}
