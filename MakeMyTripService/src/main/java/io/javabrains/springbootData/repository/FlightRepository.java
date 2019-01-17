package io.javabrains.springbootData.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import io.javabrains.springbootData.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, Long> {

	/* @Query("{source: { $regex: ?0 } })") */

	//public List<Flight> findBySource(String source);

	public List<Flight> findByDestination(String Destination);

}
