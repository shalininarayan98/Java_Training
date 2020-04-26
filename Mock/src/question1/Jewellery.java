package question1;

public class Jewellery {

	private String purchasedJewelsArr[];
	private double purchasedQuatityInGramsArr[];
	
	
	public String[] getPurchasedJewelsArr() {
		return purchasedJewelsArr;
	}


	public void setPurchasedJewelsArr(String[] purchasedJewelsArr) {
		this.purchasedJewelsArr = purchasedJewelsArr;
	}

	public double[] getPurchasedQuatityInGramsArr() {
		return purchasedQuatityInGramsArr;
	}

	public void setPurchasedQuatityInGramsArr(double[] purchasedQuatityInGramsArr) {
		this.purchasedQuatityInGramsArr = purchasedQuatityInGramsArr;
	}
	
	
	public void calcBill() {
		
		String availJewelArr[] = {"Bentex", "Silver", "Gold", "Platinum"};
		int availPricePerGramArr[] = {20, 50, 2600, 3000};
		
		String boughtJewels[] = this.getPurchasedJewelsArr();
		
		for (int i = 0; i<this.getPurchasedJewelsArr().length; i++) {
			if  (boughtJewels[i]==availJewelArr[i]) {
				
				
			}
			
		}
		
	}


	public static void main(String[] args) {
		
	}

}
