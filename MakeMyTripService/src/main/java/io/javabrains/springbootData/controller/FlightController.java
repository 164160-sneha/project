package io.javabrains.springbootData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootData.model.Flight;
import io.javabrains.springbootData.service.FlightService;



@RestController

public class FlightController {
	
	private static final String FLIGHT_COLLECTION = "Flight";
	
	@Autowired
	private FlightService flightService;

	@RequestMapping(method=RequestMethod.POST, value="flight/create")
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}
	
	/*
	  @RequestMapping(method=RequestMethod.GET, value="flight/get/{source}") public
	  List<Flight> getFlightBySource(@PathVariable String source){ return
	  flightService.getFlightBySource(source); }
	 
	@RequestMapping(method=RequestMethod.GET, value="flight/get/{destination}")
	public List<Flight> getFlightByDestination(@PathVariable String Destination) {
		return flightService.getFlightByDestination(Destination);
	}
	*/
	
	@RequestMapping(method=RequestMethod.GET, value="flight/get/{id}")
	public Optional<Flight> getFlightById(@PathVariable Long id) {
		return flightService.getFlightById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="flight/get")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlight();
	}
}
