package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p29")
public class P29 {
	@RequestMapping(method= RequestMethod.POST)
	public String p29(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double n= obj.getInt("n");
		if(n>100){
			return "This is a message to show that n is greater than 100";
		}
		else{
			return null;
		}
		
		
	}

}
