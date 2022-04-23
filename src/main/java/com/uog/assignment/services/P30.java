package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p30")
public class P30 {
	@RequestMapping(method= RequestMethod.POST)
	public String p30(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		double n= obj.getInt("n");
		if(n%2==0){
			return "This is a even";
		}
		else{
			return "This is odd";
		}
		
		
	}

}
