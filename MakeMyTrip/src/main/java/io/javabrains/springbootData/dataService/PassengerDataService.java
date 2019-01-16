package io.javabrains.springbootData.dataService;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootData.model.Passenger;
import io.javabrains.springbootData.repository.PassengerRepository;

@RestController
public class PassengerDataService {

	/* private MongoOperations mongoOps; */
	private static final String PASSENGER_COLLECTION = "Passenger";

	/*
	 * public PassengerDAOImpl(MongoOperations mongoOps){ this.mongoOps=mongoOps; }
	 */
	@Autowired
	private PassengerRepository passengerDAO;

	@RequestMapping(method = RequestMethod.POST, value = "passenger/create")
	public void addPassenger(@RequestBody Passenger passenger) {
		passengerDAO.save(passenger);

	}

	/*
	 * @RequestMapping(method = RequestMethod.GET, value = "passenger/get") public
	 * List<Passenger> getAllPassenger() { return passengerDAO.findAll(); }
	 */

//	@RequestMapping(method = RequestMethod.GET, value = "passenger/get/{id}")
//	public Optional<Passenger> getPassenger(@PathVariable String id) {
//		return passengerDAO.findById(id);
//	}

	@RequestMapping(method = RequestMethod.PUT, value = "passenger/update/{id}")
	public void updatePassenger(@RequestBody Passenger passenger, @PathVariable String id) {
		passengerDAO.save(passenger);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "passenger/delete/{id}")
	public void deletePassenger(@PathVariable String id) {
		passengerDAO.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "passenger/get")
	public HttpEntity<List<Passenger>> getAllEmployees() {
        List<Passenger> passenger = passengerDAO.findAll();
        if (passenger.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
        	
            return new ResponseEntity<>(passenger, HttpStatus.OK);
        }
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "passenger/get/{id}")
	public Passenger getPassenger(@PathVariable String id, @Context UriInfo uriInfo) {
		Optional<Passenger> passenger = passengerDAO.findById(id);
	
		String uri = uriInfo.getBaseUriBuilder().path(PassengerDataService.class).path(String.toString(passenger.getId())).build().toString();
    

	}

	
	


