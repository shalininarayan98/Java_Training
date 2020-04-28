package com.infy.eta.oop;

public class AdMovies extends AdAgencyService{
	private double noOfDaysOfShooting;
	private char typeOfAdMovie;
	
	public AdMovies(String customerType, Model model,double noOfDaysOfShooting,char typeOfAdMovie) {
		super(customerType, model);
		this.noOfDaysOfShooting = noOfDaysOfShooting;
		this.typeOfAdMovie = typeOfAdMovie;
		
	}

	
	public double getNoOfDaysOfShooting() {
		return noOfDaysOfShooting;
	}

	public boolean validateNoOfDaysOfShooting() {
		
		//Write your logic here
		
		//Change the return value based on the implementation
		return false;
		
	}

	public boolean validateTypeOfAdMovie() {
		
		//Write your logic here
		
		//Change the return value based on the implementation
		return false;
		
	}
	@Override
	public long calculateQuotationAmount() {
		
		//Write your logic here
		
		//Change the return value based on the implementation
		return 0L;
	}

}
