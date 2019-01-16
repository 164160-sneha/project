package io.javabrains.springbootData.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.javabrains.springbootData.support.DateHandler;;

@Document()
public class Flight {
	@Id
	private String flightId;
	private double cost;
	private List<Link> links=new ArrayList<>();
	
	public Flight(String flightId, String flightName, String source, String destination, Date arrival, Date departure,double cost) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		this.Departure = departure;
		this.cost=cost;
	}
		public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Flight() {
		super();
	}
	private String flightName;
	private String source;
	private String destination;
	@JsonDeserialize(using =DateHandler.class)
	private Date arrival;
	@JsonDeserialize(using =DateHandler.class)
	private Date Departure;
	public String getflightId() {
		return flightId;
	}
	public void setflightId(String string) {
		this.flightId = string;
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
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Date getDeparture() {
		return Departure;
	}
	public void setDeparture(Date departure) {
		Departure = departure;
	}

	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String url, String rel) {
		Link link=new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", cost=" + cost + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", arrival=" + arrival + ", Departure=" + Departure + "]";
	}

}
