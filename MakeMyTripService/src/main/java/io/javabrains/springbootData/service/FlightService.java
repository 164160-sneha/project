package io.javabrains.springbootData.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootData.model.Flight;
import io.javabrains.springbootData.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	FlightRepository flightDAO;

	public void addFlight(Flight flight) {
		flightDAO.save(flight);
	}

	/*
	 * public List<Flight> getFlightBySource(String source){ return
	 * flightDAO.findBySource(source);
	 * 
	 * 
	 * List<Flight> allflights= new ArrayList<>(); for (Flight flight :
	 * flightDAO.findBySource(source)) { allflights.add(flight); } return
	 * allflights;
	 * 
	 * 
	 * }
	 */
	
	public Optional<Flight> getFlightById(Long id) {
		return flightDAO.findById(id);
		
	}
	
	/*
	 * public List<Flight> getFlightBySource(String source) { List<Flight> list=new
	 * ArrayList<>(); for(Flight index :list) { index.getSource().equals(source);
	 * list.add(arg0) } }
	 */

	public List<Flight> getFlightByDestination(String Destination) {
		return flightDAO.findByDestination(Destination);
	}
	
	public List<Flight> getAllFlight() {
		return flightDAO.findAll();
	}
}
