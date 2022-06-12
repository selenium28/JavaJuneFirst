package basic;

public class ArrayConcept {

	public static void main(String[] args) {
	
	// Array: To store similar DataType vales in array variable. 	
	// Array index starting from zero	
	// size n: n-1; ex: 4-1 = 3	(n is a size of array)
		
	// Disadvantage of array: 
	// Size if fixed 
	// Store only similar data types
		
	//	int i = 20;
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50;
		
//		System.out.println(i[2]);
//		System.out.println(i[0]);
//		System.out.println(i[4]);  // ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		for(int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		double d[] = new double[10];
		

		
	}

}
