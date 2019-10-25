package com.luv4boot.springcore.constructorinjection;

public class Employee {
	private int id;
	private Address address;

	public Employee() {
	}

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, address=%s]", id, address);
	}

}
