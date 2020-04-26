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
		
		if ((this.noOfDaysOfShooting>=2) && (this.noOfDaysOfShooting<=100)) {
		
		return true;
		}
		
		else 
		return false;

	}

	public boolean validateTypeOfAdMovie() {
		
		if ((this.typeOfAdMovie == 'H') || (this.typeOfAdMovie == 'A') || (this.typeOfAdMovie == 'L')) {
			return true;
		}
	
		return false;
		
	}
	/*private String String(char typeOfAdMovie2) {
		// TODO Auto-generated method stub
		return null;
	}*/


	@Override
	public long calculateQuotationAmount() {
		
		//if ((validateNoOfDaysOfShooting()==true) && (validateTypeOfAdMovie()==true) && ()
		
		if(validateTypeOfAdMovie() && validateNoOfDaysOfShooting() && this.getModel().validateRemunerationPerDay()) {
			
			long actualNumberOfShootingDays = Math.round(this.noOfDaysOfShooting);
			
			double budget = 0.0;
			
			if(this.typeOfAdMovie=='H') {
				budget = 2500000;
			}
			
			else if(this.typeOfAdMovie=='A') {
				budget = 2000000;
			}
			
			else if(this.typeOfAdMovie=='L') {
				budget = 1500000;
			}
			
			double totalBudget= budget + this.getModel().getRemunerationPerDay()+actualNumberOfShootingDays;
			
			if(this.typeOfAdMovie=='H') {
				totalBudget=totalBudget + totalBudget * 0.2525;
			}
			if(this.typeOfAdMovie=='A') {
				totalBudget=totalBudget + totalBudget * 0.175;
			}
			if(this.typeOfAdMovie=='L') {
				totalBudget=totalBudget + totalBudget * 0.1275;
			}
			
			if (this.getCustomerType().equals("Public")) {
				totalBudget=totalBudget+totalBudget*0.1575;
			}
			if (this.getCustomerType().equals("Private")) {
				totalBudget=totalBudget+totalBudget*0.2025;
			}
			if (this.getCustomerType().equals("Government")) {
				totalBudget=totalBudget;
			}
			
			
			long baseQuotationAmount=super.calculateQuotationAmount();
			
			totalBudget = totalBudget + baseQuotationAmount;
			
			long quotationAmount = (long)Math.ceil(totalBudget);
			
			return quotationAmount;
		}
		else

		return -1L;
	}

}
