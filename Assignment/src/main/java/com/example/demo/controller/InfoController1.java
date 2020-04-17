package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Info;
import com.example.demo.service.InfoService;



@RestController
@RequestMapping("/api")
public class InfoController1 {
	
	@Autowired
	private InfoService service;
 
	@PostMapping("/info/addingdata")
	public Info addData(@RequestBody Info info)
	{
		return service.infoman(info);
		
	}
	
	@GetMapping("/Get/{id}")
	public MappingJacksonValue getInfo(@PathVariable Integer id)
	
	{
		
		return service.InfoByState(id);
		
	}
	//getting only particular fields by using dynamic filtering 
	@GetMapping("/Get/state/{state}")
	public MappingJacksonValue getInfo( @PathVariable String state)
	
	{
		
		return service.InfoByStateMethod(state);
		
	}
	
	
}
