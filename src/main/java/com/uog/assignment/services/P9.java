package com.uog.assignment.services;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p9")
public class P9 {
	@RequestMapping(method= RequestMethod.POST)
	public int p9(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		int a= obj.getInt("a");
		int b= obj.getInt("b");
		int c= obj.getInt("c");
		int d= obj.getInt("d");
		if(a>b & a>c & a>d){
			return a;
		}
		else if(b>a & b>c & b>d){
			return b;
		}
		else if(c>a & c>b & c>d){
			return c;
		}
		else{
			return d;
		}
	}

}
