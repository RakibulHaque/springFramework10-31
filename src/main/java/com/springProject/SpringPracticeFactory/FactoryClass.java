package com.springProject.SpringPracticeFactory;

public class FactoryClass {
	
	public Patient patientCreate(int id,String name)
	{
		System.out.println("Using Factory Class.");
		return new Patient(7,"rocky");
	}

}
