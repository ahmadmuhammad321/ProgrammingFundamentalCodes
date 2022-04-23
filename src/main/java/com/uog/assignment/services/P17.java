package com.uog.assignment.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p17")
public class P17 {
	@RequestMapping(method = RequestMethod.POST)
	public List<Double> p17(@RequestBody String data){
		List<Double> list = new ArrayList<Double>();
		JSONObject obj = new JSONObject(data);
		double a=obj.getInt("x");
		
		double fractional = a%1;
		double integral = a - fractional;
		list.add(fractional);
		list.add(integral);
		return list;
	}

}