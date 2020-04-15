package com;

public class Circle {
	
	private double radius;
	private double pi;
	
	public double getRadius() {
		
		return this.radius;
	}
	
	public void setRadius(double radius) {
		
		this.radius=radius;

	}
	
	public double getPi() {
		
		return this.pi;
		
	}
	
	
	public void setPi(double pi) {
		this.pi=pi;
		//instance variable = passing it to this parameter
		// instance variable = local variable
		
	}
	
	public void displayArea() {
		
		double a;
		a = this.pi*this.radius*this.radius;
		System.out.println(a);
		
		
	}
	
}
