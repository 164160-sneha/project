package io.javabrains.springbootData.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootData.model.Bookings;
import io.javabrains.springbootData.repository.BookingsRepository;

@Service
public class BookingsService {

	@Autowired
	BookingsRepository bookingsDAO;

	public Optional<Bookings> getPNRStatus(Long pnr) {
		return bookingsDAO.findById(pnr);
	}

	public void addBookings(Bookings bookings) {
		bookingsDAO.save(bookings);
	}
	
	public void deleteBookings(Long pnr) {
		bookingsDAO.deleteById(pnr);
	}
}
