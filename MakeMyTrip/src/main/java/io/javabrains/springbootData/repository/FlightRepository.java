package io.javabrains.springbootData.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.javabrains.springbootData.model.Flight;



public interface FlightRepository extends MongoRepository<Flight, String> {

}