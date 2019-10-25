package com.luv4boot.studentdal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sname;
	private String scourse;
	private Double sfee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}

	public Double getSfee() {
		return sfee;
	}

	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, sname=%s, scourse=%s, sfee=%s]", id, sname, scourse, sfee);
	}

}
