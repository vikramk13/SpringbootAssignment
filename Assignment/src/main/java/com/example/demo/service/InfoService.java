package com.example.demo.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import com.example.demo.model.Info;
import com.example.demo.repository.InfoRepo;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Service
public class InfoService {
	
	private static final Logger log = LoggerFactory.getLogger(InfoService.class);

	
	@Autowired
	private InfoRepo repo;

	public Info infoman(Info info) {
	     Info info1=repo.save(info);
	     
	     log.info("info is added succesfully");
		return info1;
	}

	public MappingJacksonValue InfoByState(Integer id) {
	Optional<Info> user5=repo.findById(id);
		// TODO Auto-generated method stub
		                  Set<String> fields=new HashSet<>();
		                  fields.add("state");
		                  fields.add("district");
		                  fields.add("districtCode");
 		
		                  FilterProvider filter=new SimpleFilterProvider().addFilter("Info", SimpleBeanPropertyFilter.filterOutAllExcept(fields));
		                  MappingJacksonValue mapper=new MappingJacksonValue(user5);
		                  mapper.setFilters(filter);
		                 
		                  return mapper;	
		

		
	}
	
	
	public MappingJacksonValue InfoByStateMethod(String state) {
		Optional<Info> user5=repo.findByState(state);
			// TODO Auto-generated method stub
			                  Set<String> fields=new HashSet<>();
			                  fields.add("state");
			                  fields.add("district");
			                  fields.add("districtCode");
	 		
			                  FilterProvider filter=new SimpleFilterProvider().addFilter("Info", SimpleBeanPropertyFilter.filterOutAllExcept(fields));
			                  MappingJacksonValue mapper=new MappingJacksonValue(user5);
			                  mapper.setFilters(filter);
			                 
			                  return mapper;	
			

			
		}
		

	
	

}
