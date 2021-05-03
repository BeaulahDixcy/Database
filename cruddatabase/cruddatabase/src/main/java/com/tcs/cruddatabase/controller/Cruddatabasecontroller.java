package com.tcs.cruddatabase.controller;
import com.tcs.cruddatabase.repo.CruddatabaseRepo;
import com.tcs.cruddatabase.variables.Data;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cruddatabasecontroller {
	@Autowired
	CruddatabaseRepo repo;
	
	@RequestMapping("/")
	public Iterable<Data> Variables()
	{
		return repo.findAll();
	}
	
	@DeleteMapping("/user/{id}")
	public Data deleteAlien(@PathVariable int id)
	{
		repo.deleteById(id);
		return null;
	}
	
	 @RequestMapping("/addVariables")
		public String addData(Data var)
		{
	    	repo.save(var);
			return "crud.jsp";
		}
	 
	 @PostMapping("/user")
		public Data addVar(@RequestBody Data var)
		{
	    	repo.save(var);
			return var;
		}
	 
	 @GetMapping("/users/{id}")
	 public Optional<Data> getData(@PathVariable int id)
	 {
		
		 return repo.findById(id);
		 
	 }
	 
	 @PutMapping("/user")  
	 private Data update(@RequestBody Data user)   
	 {  
		 return repo.save(user);
	 } 
		
	

}
