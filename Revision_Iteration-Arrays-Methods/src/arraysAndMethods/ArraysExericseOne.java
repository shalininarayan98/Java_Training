package arraysAndMethods;

public class ArraysExericseOne {
	
	private int list[];
	
	public ArraysExericseOne(int[] list) {

		this.list = list;
	}

	public int[] getList() {
		return list;
	}
	
	
	public int sumArr() {
		
		int[] array = this.getList();
		int sum = 0;
		
		for (int i=0; i< array.length;i++) {
			sum = array[i] + sum;
			
		}

		return sum;
	}


	public static void main(String[] args) {
		
		int arr[] = {10,20,33,42,52};
		
		ArraysExericseOne a = new ArraysExericseOne(arr);
		
		System.out.println(a.sumArr());
		

	}

}
