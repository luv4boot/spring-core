package com.luv4boot.springcoreadvanced.autowired.annotations.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String name;

	@Autowired(required = false)
	@Qualifier("reservation1234")
	private Reservation reservation;

	/*
	 * @Autowired(required = false) public Customer(String name, Reservation
	 * reservation) { super(); this.name = name; this.reservation = reservation; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

}
