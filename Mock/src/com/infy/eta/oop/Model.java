package com.infy.eta.oop;

import sun.security.util.Length;

public class Model {
	private int modelId;
	private int modelGrade;
	private double remunerationPerDay;
	private double[] modelRemuneration = {25000,30000,45000,57500,100000,150000};
	
	public Model(int modelId,double remunerationPerDay) {
		this.modelId = modelId;
		this.remunerationPerDay = remunerationPerDay;	
		this.modelGrade=this.modelId/10000;
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
		
		if (this.remunerationPerDay > modelRemuneration[modelGrade-1] && this.remunerationPerDay <= modelRemuneration[modelGrade])
			return true;
		else
			return false;

	}
}
