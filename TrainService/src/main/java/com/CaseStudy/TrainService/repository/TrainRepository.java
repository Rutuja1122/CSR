package com.CaseStudy.TrainService.repository;


import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.TrainService.model.Trains;

public interface TrainRepository extends MongoRepository<Trains, String> {

	Optional<Trains> findByStartStation(String startStation);

	List<Trains> findByEndStation(String endStation);
	
	Optional<Trains> findById(String trainid);

	void deleteById(String trainid);

}