package com.CaseStudy.AdminSecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CaseStudy.AdminSecurity.model.AdminModel;

@Repository   
public interface AdminRepository extends MongoRepository<AdminModel, String> {
	
	AdminModel findByUsername(String username);
}