package com.infy.eta.tester;

import com.infy.eta.pf.Solution;
import com.infy.eta.oop.AdAgencyService;
import com.infy.eta.oop.AdMovies;
import com.infy.eta.oop.Model;

public class Tester 
{
	
	public static void main(String[] args)
	{
		
		/* PF */
		String[] availJewelArr = {"Bentex","Silver","Gold","Platinum"};
		int[] availPricePerGramArr ={20,50,2600,3000};
		
		String[] purchasedJewelsArr1= {"Silv","Gold","Platinum","Ben"};
		int[] purchasedQuatityArr1= {1,2,3,4};
		
		String[] purchasedJewelsArr2= {"Gold","Platinum"};
		int[] purchasedQuatityArr2= {4,5};
		
		String[] purchasedJewelsArr3= {"Silver","Gold","Platinum","Bentex"};
		int[] purchasedQuatityArr3= {3,5,5,5};
		System.out.println(new Solution().calculateBillAmount(availJewelArr,availPricePerGramArr,purchasedJewelsArr1,purchasedQuatityArr1));
		System.out.println(new Solution().calculateBillAmount(availJewelArr,availPricePerGramArr,purchasedJewelsArr2,purchasedQuatityArr2));
		System.out.println(new Solution().calculateBillAmount(availJewelArr,availPricePerGramArr,purchasedJewelsArr3,purchasedQuatityArr3));
	

		/* OOP */
		Model modelobj = new Model(23534,35000);
		AdMovies admoviesobj = new AdMovies("Public",modelobj,10.0,'H');		
		System.out.println(admoviesobj.calculateQuotationAmount());
		
		Model modelobj1 = new Model(20987,30001);
		AdMovies admoviesobj1 = new AdMovies("Government",modelobj1,12.5,'Z');		
		System.out.println(admoviesobj1.calculateQuotationAmount());
		
		Model modelobj2 = new Model(26789,30001);
		AdMovies admoviesobj2 = new AdMovies("government",modelobj2,10.51,'L');		
		System.out.println(admoviesobj2.calculateQuotationAmount());
		
		
	

	}

}
