package io.javabrains.springbootData.dataService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootData.model.Flight;
@RestController
public class FlightController {
	
@Autowired	
FlightService flightService;

@RequestMapping(method = RequestMethod.POST, value = "flight/create")
public void create(@RequestBody Flight fli) {
	fli.setflightId(ObjectId.get().toHexString());
	flightService.addFlight(fli);

}

@RequestMapping("/flights" )
public  List<Flight> FlightsList( ){
	List<Flight> service= flightService.getAllFlights();
	
	return service;
}

@RequestMapping(method = RequestMethod.GET,value="/flights/{flightName}")
public @ResponseBody Flight getFlight(@PathVariable String flightName) {
	return flightService.getFlight(flightName);
}

@RequestMapping(method = RequestMethod.PUT, value="/flights/{flightName}")
public  boolean updateFlight(@RequestBody Flight flight,@PathVariable String flightName){

	return flightService.updateFlight(flight, flightName);
}
@RequestMapping("/flight/source/{source}")
public boolean CheckSource(@PathVariable String source) {
	
	
	return flightService.checkSource(source);
	
}
@RequestMapping("/flight/destination/{destination}")
public boolean CheckDestination(@PathVariable String destination) {
	
	
	return flightService.checkDestination(destination);
	
}



}