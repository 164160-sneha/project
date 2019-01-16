package io.javabrains.springbootData.dataService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootData.model.Flight;
import io.javabrains.springbootData.repository.FlightRepository;



@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;

	public FlightRepository getFlightRepository() {
		return flightRepository;
	}

	public void setFlightRepository(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	Flight flight;
	public void addFlight(Flight flight) {
	

			flightRepository.save(flight);
		
	}
	
	public List<Flight> getAllFlights() {
	return flightRepository.findAll();	
	}
	public Flight getFlight(String Name) {
		List<Flight> flights=flightRepository.findAll();
		for (Flight list1 : flights) {

			if (list1.getFlightName().equals(Name)) {
				return list1;
			}
		}
		return null;
		}
	
	public boolean updateFlight(Flight flight  ,String Name) {
		List<Flight> flights=flightRepository.findAll();
		
		for (Flight list1 : flights) {

			if (list1.getFlightName().equals(Name)) {
				flightRepository.save(flight);
				return true;
			}
		}
		return false;
		}
	public boolean checkSource(String source) {
		List<Flight> flights=flightRepository.findAll();
		
		for (Flight list1 : flights) {

			if (list1.getSource().equals(source)) {
				
				return true;
			}
		}
		return false;
		}
	public boolean checkDestination(String destination) {
		List<Flight> flights=flightRepository.findAll();
		
		for (Flight list1 : flights) {

			if (list1.getDestination().equals(destination)) {
				
				return true;
			}
		}
		return false;
		}
	


}
