package io.javabrains.springbootData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.javabrains.springbootData.model.Passenger;
import io.javabrains.springbootData.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository passengerDAO;
	
	public void addPassenger(Passenger passenger) {
		passengerDAO.save(passenger);
	}
	
	public List<Passenger> getAllPassenger() {
		return passengerDAO.findAll();
	}
	
	public Optional<Passenger> getPassengerById(String email) {
		return passengerDAO.findById(email);
		
	}
	
	public void updatePassenger(Passenger passenger) {
		passengerDAO.save(passenger);
	}
	
	public void deletePassenger(String email) {
		passengerDAO.deleteById(email);
	}


}
