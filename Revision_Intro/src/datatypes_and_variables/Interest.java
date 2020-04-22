package datatypes_and_variables;

public class Interest {
		
		private int si;
		private int p;
		private int r;
		private int t;
		
		public Interest(int p, int r, int t) {
			this.p = p;
			this.r = r;
			this.t = t;
		}

		public int getSi() {
			return si;
		}

		public int getP() {
			return p;
		}

		public int getR() {
			return r;
		}

		public int getT() {
			return t;
		}
		
		public void calculateSi() {
			
			this.si= (this.getP()*this.getR()*this.getT()/100);
			
			System.out.println(this.si);
		}

	}

class Tester {
	
	public static void main(String[] args) {
		
		Interest i1= new Interest(2500, 4, 4);
		i1.calculateSi();
		
	}
	
	
}
	


	

