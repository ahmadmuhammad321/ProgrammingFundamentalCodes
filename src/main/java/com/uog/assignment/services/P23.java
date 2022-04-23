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
@RequestMapping("/p23")
public class P23 {
	@RequestMapping(method= RequestMethod.POST)
	public List<Double> p23(@RequestBody String data){
		JSONObject obj = new JSONObject(data);
		List<Double> list = new ArrayList<Double>();
		double R= obj.getInt("R");
		double pi= 3.1417;
		Double area=pi*R*R;
		Double circumf=2*pi*R;
		
		list.add(area);
		list.add(circumf);
		return list;
	}

}