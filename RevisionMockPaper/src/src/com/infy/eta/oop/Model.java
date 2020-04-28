package com.infy.eta.oop;

public class Model {
	private int modelId;
	private int modelGrade;
	private double remunerationPerDay;
	private double[] modelRemuneration = {25000,30000,45000,57500,100000,150000};
	
	public Model(int modelId,double remunerationPerDay) {
		
		//Write your logic here				
		
	}
	public int getModelId() {
		return modelId;
	}
	public int getModelGrade() {
		return modelGrade;
	}
	public double getRemunerationPerDay() {
		return remunerationPerDay;
	}
	public double[] getModelRemuneration() {
		return modelRemuneration;
	}
	
	public boolean validateRemunerationPerDay() {
			
		//Write your logic here
		
		//Change the return value based on the implementation
		return false;
		
	}
}
