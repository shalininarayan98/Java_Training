package method_overriding;


class Citizen{
	int accountNo;
	
}

class UnEmployed extends Citizen {
	
	
}


class Bonus{
	
	public void giveBonus(Citizen c) {
		c.accountNo=1000;
		
	}
	
	public void giveBonusEmployee(Citizen c) {
		c.accountNo=1000;
		
	}
	
	
}



public class Test1 {
	public static void main(String[] args) {
		Bonus b = new Bonus();
		UnEmployed e = new UnEmployed();
		UnEmployed u = new UnEmployed();
		
		
		b.giveBonus(e);
		b.giveBonus(u);
	}

}
