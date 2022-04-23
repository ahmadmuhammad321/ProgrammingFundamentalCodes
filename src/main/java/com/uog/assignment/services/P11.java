package com.uog.assignment.services;



import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p11")
public class P11 {
	@RequestMapping(method = RequestMethod.POST)
	public int p11(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		int a=obj.getInt("x");
		int b=obj.getInt("y");
		int average=(a+b)/2;
		
		
		return average;
	}

}
