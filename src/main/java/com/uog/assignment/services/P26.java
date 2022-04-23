package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p26")
public class P26 {
	@RequestMapping(method= RequestMethod.POST)
	public double p26(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double Rupees= obj.getInt("Rupees");
		
		double dollars = Rupees/160;
		return dollars;
	}

}

