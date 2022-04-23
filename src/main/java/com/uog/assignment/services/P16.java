package com.uog.assignment.services;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/p16")
public class P16 {
	@RequestMapping(method=RequestMethod.GET)
	public int p16(){
		int a,b,c,product;
		
		a = b = c =3;
		product = a*b*c;
		
		return product;
	}

}