package com;

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate c1= new Chocolate();
		
		c1.setBarCode(101);
		c1.setCost(10);
		c1.setName("Lindor");
		c1.setWeight(5);
		
		System.out.println("Barcode: " + c1.getBarCode());
		System.out.println("Cost :" + c1.getCost());
		System.out.println("Name: " + c1.getName()); 
		System.out.println("Weight: " + c1.getWeight());
		
		Chocolate c2 = new Chocolate();
		
		c2.setBarCode(102);
		c2.setCost(200);
		c2.setName("Cadbury");
		c2.setWeight(10); 
		
		Chocolate c3;
		c3=c2;
		
		c2=c1;
		
		System.out.println("Barcode: " + c2.getBarCode());
		System.out.println("Cost :" + c2.getCost());
		System.out.println("Name: " + c2.getName()); 
		System.out.println("Weight: " + c2.getWeight());
		
		System.out.println("Barcode: " + c3.getBarCode());
		System.out.println("Cost :" + c3.getCost());
		System.out.println("Name: " + c3.getName()); 
		System.out.println("Weight: " + c3.getWeight());
		
		

	}

}
