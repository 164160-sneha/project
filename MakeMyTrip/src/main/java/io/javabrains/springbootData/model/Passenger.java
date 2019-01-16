package io.javabrains.springbootData.model;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;


@Document(collection = "Passenger")
public class Passenger {
	String id;
	String passengerName; 
	String email;
	String password;
	private List<Link> links=new ArrayList<>();
	//Bookings bookings;
	
	public Passenger() {
		super();
	}
	
	
	public Passenger( String id, String passengerName, String email, String password) {
		super();
		
		this.passengerName = passengerName;
		this.email = email;
		this.password = password;
		this.id=id;
	}

	

	public List<Link> getLinks() {
		return links;
	}


	public void setLinks(List<Link> links) {
	this.links = links;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	public void addLink(String url, String rel) {
		Link link=new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	} 



	@Override
	public String toString() {
		return "Passenger [id=" + id + ", passengerName=" + passengerName + ", email=" + email + ", password="
				+ password + ", bookings=]";
	}
	

}
