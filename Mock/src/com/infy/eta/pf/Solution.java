package com.infy.eta.pf;


public class Solution {
	

	public double calculateBillAmount(String[] availJewelArr,int[] availPricePerGramArr,String[] purchasedJewelsArr ,int[] purchasedQuatityArr ){
		
		double billAmount=0.0;
		
		
		for (int i=0; i<purchasedJewelsArr.length;i++) {
			boolean flag=false;
			for(int j=0;j<availJewelArr.length;j++) {
				if(purchasedJewelsArr[i].equalsIgnoreCase(availJewelArr[j])) {
					flag=true;
					billAmount=billAmount+purchasedQuatityArr[i]*availPricePerGramArr[j];
				}
			}
			if(!flag) {
				return -1.0;
			}
			
		}
		
		if(billAmount>=20000) {
			return billAmount-0.3*billAmount;
		}
		return billAmount;		
	}
	
}
