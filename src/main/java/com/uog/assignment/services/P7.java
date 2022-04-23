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
@RequestMapping("/p7")
public class P7 {
	@RequestMapping(method = RequestMethod.POST)
	public List<Integer> p7(@RequestBody String data){
		List<Integer> list = new ArrayList<Integer>();
		JSONObject obj = new JSONObject(data);
		int PF_marks= obj.getInt("PF_marks");
		int ICG_marks= obj.getInt("ICG_marks");
		int total_marks= PF_marks+ICG_marks;
		int average_marks= total_marks/2;
		list.add(total_marks);
		list.add(average_marks);
		
		return list;
	}

}