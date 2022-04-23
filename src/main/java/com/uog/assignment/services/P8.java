package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p8")
public class P8 {
	@RequestMapping(method= RequestMethod.POST)
	public int p8(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		int Temp_F= obj.getInt("Temp_F");
		
		int Temp_C = (Temp_F-32)*5/9;
		return Temp_C;
	}

}