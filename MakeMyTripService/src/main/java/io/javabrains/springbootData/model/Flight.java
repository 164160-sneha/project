package io.javabrains.springbootData.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.Link;

@Document(collection = "Flights")
public class Flight {
	@Id
	private Long flightId;
	private double cost;
	private String flightName;
	private String source;
	private String destination;
	private Date DateOfarrival;
	private Date DateOfDeparture;

	// private List<Link> links=new ArrayList<>();

	
	
	public Flight(Long flightId, double cost, String flightName, String source, String destination, Date dateOfarrival,
			Date dateOfDeparture) {
		super();
		this.flightId = flightId;
		this.cost = cost;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		DateOfarrival = dateOfarrival;
		DateOfDeparture = dateOfDeparture;
	}

	public Flight() {
		super();
		
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfarrival() {
		return DateOfarrival;
	}

	public void setDateOfarrival(Date dateOfarrival) {
		DateOfarrival = dateOfarrival;
	}

	public Date getDateOfDeparture() {
		return DateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		DateOfDeparture = dateOfDeparture;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", cost=" + cost + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", DateOfarrival=" + DateOfarrival + ", DateOfDeparture="
				+ DateOfDeparture + "]";
	}

}
