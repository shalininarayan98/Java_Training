package assignmentInheritance;


public class EventTester {

	public static void main(String[] args)
	{
		EventRegistration r = new EventRegistration("Shaz", "Sing&Win");
		SingleEventRegistration s = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		TeamEventRegistration tr = new TeamEventRegistration("Shaz", "ShakeALeg", 2, 1);
		
		//SingleEventRegistration s1 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		
		//System.out.println(r.getRegistrationFee());
		//System.out.println(s.getNameOfEvent());
		//System.out.println(s.getRegistrationFee());
		
		//r.registerEvent();
		//System.out.print(r.getRegistrationFee());
		
		//s.registerEvent();
		//System.out.println(s.getRegistrationFee());
		
		tr.registerEvent();
		System.out.println(tr.getRegistrationFee());

	}

}
