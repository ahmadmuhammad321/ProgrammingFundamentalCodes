package com.uog.assignment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p21")
public class P21 {
	@RequestMapping(method = RequestMethod.GET)
	public List<String> p21(){
		List<String> list = new ArrayList<String>();
		String z="X";
		for(int a= 5; a>=1;a--){
			for(int i=1; i<=a; i++){
				list.add(z);
			}
			
		}
		return list;
	}

}
