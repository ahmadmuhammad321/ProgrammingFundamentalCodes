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
@RequestMapping("/p24")
public class P24 {
	@RequestMapping(method = RequestMethod.POST)
	public List<Integer> p24(@RequestBody String data){
		List<Integer> list = new ArrayList<Integer>();
		JSONObject obj = new JSONObject(data);
		int S1_marks= obj.getInt("S1_marks");
		int S2_marks= obj.getInt("S2_marks");
		int S3_marks= obj.getInt("S3_marks");
		int S4_marks= obj.getInt("S4_marks");
		int S5_marks= obj.getInt("S5_marks");
		int total_marks= S1_marks+S2_marks+S3_marks+S4_marks+S5_marks;
		int average_marks= total_marks/5;
		list.add(total_marks);
		list.add(average_marks);
		
		return list;
	}

}