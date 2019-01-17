package io.javabrains.springbootData.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootData.model.Bookings;
import io.javabrains.springbootData.service.BookingsService;

@RestController
public class BookingsController {

	@Autowired
	private BookingsService bookingsService;

	@RequestMapping(method = RequestMethod.GET, value = "bookings/get/{pnr}")
	public Optional<Bookings> getPNRStatus(@PathVariable Long pnr) {
		return bookingsService.getPNRStatus(pnr);
	}

	@RequestMapping(method = RequestMethod.POST, value = "bookings/create")
	public void addBookings(@RequestBody Bookings bookings) {
		bookingsService.addBookings(bookings);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="bookings/delete/{pnr}")
	public void deleteBookings(@PathVariable Long pnr) {
		bookingsService.deleteBookings(pnr);
	}
	
}
