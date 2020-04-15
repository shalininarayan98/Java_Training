package com;

public class Chocolate {

	private int barCode;
	private String name;
	private int weight;
	private int cost;

	// constructor (chocolate)- must be same as class name & NO RETURN TYPE!!

	public Chocolate() {

	}

	public int getBarCode() {

		return this.barCode;
	}

	public void setBarCode(int barCode) {
		
		this.barCode=barCode;

	}

	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {

		return this.name=name;

	}

	public void setWeight(int weight) {
		
		this.weight=weight;

	}

	public int getWeight() {

		return this.weight=weight;
	}

	public void setCost(int cost) {
		this.cost=cost;

	}

	public int getCost() {

		return this.cost=cost;
	}

}

