package aggregation;

public class Tester {
	
	public static void main(String[] args) {
		
		String med[] = {"Alo","vel", "kzry", "sento","myx","logy"};
		Bill bill1 = new Bill(101, 1000, med);
		
		Patient p1 = new Patient("Vignesh", 23, bill1);
		
		System.out.println(p1.CalculateDiscount());
		System.out.println();

}
}
