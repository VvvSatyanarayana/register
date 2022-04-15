package com.capgemini.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.project.entity.Register;


@Repository
public interface RegisterRepository extends CrudRepository<Register,Integer>{
	List<Register> findAll();

}
