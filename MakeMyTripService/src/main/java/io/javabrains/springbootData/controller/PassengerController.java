package io.javabrains.springbootData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.javabrains.springbootData.model.Passenger;
import io.javabrains.springbootData.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@RequestMapping(method = RequestMethod.POST, value = "passenger/create")
	public void addPassenger(@RequestBody Passenger passenegr) {
		passengerService.addPassenger(passenegr);
	}

	@RequestMapping(method = RequestMethod.GET, value = "passenger/get")
	public List<Passenger> getAllPassenger() {
		return passengerService.getAllPassenger();

	}
	
	@RequestMapping(method= RequestMethod.GET, value="passenger/get/{email}")
	public Optional<Passenger> getPassengerById(@PathVariable String email){
		return passengerService.getPassengerById(email);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="passenger/update/{email}")
	public void updatePassenger(@RequestBody Passenger passenger) {
		passengerService.updatePassenger(passenger);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="passenger/delete/{email}")
	public void updatePassenger(@PathVariable String email ) {
		passengerService.deletePassenger(email);
	}
}