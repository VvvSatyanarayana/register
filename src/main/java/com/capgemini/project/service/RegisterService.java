package com.capgemini.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.project.entity.Register;
import com.capgemini.project.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository rrepo;
public Register saveRegister(Register r) {
	return rrepo.save(r);
}
	public List<Register> getAllRegister(){
		return rrepo.findAll();
	}
	public Register getRegisterById(int id) {
		Optional<Register> op=rrepo.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		else {
			return null;
		}
		
	}
	public Register updateRegister(Register register) {
		return rrepo.save(register);
	}
	public String deleteRegister(int mobile) {
		rrepo.deleteById(mobile);
		return "Deleted successfull....";
	}
	
	
	

}
