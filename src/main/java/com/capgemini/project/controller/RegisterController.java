package com.capgemini.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.project.entity.Register;
import com.capgemini.project.service.RegisterService;




//@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("data/")
public class RegisterController {
	@GetMapping("/msg")
	public String getMessage() {
		return "hello ";
	}
	@Autowired
	private RegisterService rservice;
	
	@PostMapping("/saveregister")
	public ResponseEntity<Register> saveRegister(@RequestBody Register register){
		System.out.println(register);
		return new ResponseEntity<Register>(rservice.saveRegister(register),HttpStatus.OK);
	}
	
	
	@GetMapping("/getallregister")
	public List<Register> getAllRegister() {
		
		
		return rservice.getAllRegister();
	}
	
	@GetMapping("/getregister/{id}")
	public ResponseEntity<Object> getRegisterById(@PathVariable("id") int id){
		Register r=rservice.getRegisterById(id);
		if(r==null) {
			return new ResponseEntity<Object>("NO DATA FOUND......",HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<Object>(r,HttpStatus.OK);
		}
	}
	
	@PutMapping("/updateregister")
	public Register updateRegister(@RequestBody Register register) {
		return rservice.updateRegister(register);
	}
	@DeleteMapping("/deleteregister/{id}")
	public String deleteRegister(@PathVariable("id" )int mobile) {
		return rservice.deleteRegister(mobile);
	}

}
