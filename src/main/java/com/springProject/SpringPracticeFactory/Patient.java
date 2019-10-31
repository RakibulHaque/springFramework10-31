package com.springProject.SpringPracticeFactory;

import java.util.List;

//病気の情報．
public class Patient {

	private int id;
	private String name;
	private String nationalId;
	private Address address;
	
	private List<String> emergencyContactNames;

	public Patient() {

	}

	public static Patient getInstance(int id, String name) {
		System.out.println("using Factory Method.");

		return new Patient(id, name);

	}

	
	public void onCreate() {
		System.out.println("patient create:" + this);

	}

	public Patient(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	
	public List<String> getEmergencyContactNames() {
		return emergencyContactNames;
	}

	public void setEmergencyContactNames(List<String> emergencyContactNames) {
		this.emergencyContactNames = emergencyContactNames;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + ", address=" + address + "]";
	}

}
