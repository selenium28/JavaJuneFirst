package basic;

public class JavaFirstProgram {
	
	//Starting/Execution of the program - main() Method
	public static void main(String[] args) {
		//DataTypes
		//Primitive DataTypes: int, double, char, boolean
		//Non Primitive DataTypes: String and Array.
		
		// 1. Int  
		// int - datatype, a - variable, 10 - value.
		int a = 10;  // Duplicate variables not allowed.
		int b = 100;
		int c = -10;
//		int c1 = 33.33;  double values does't allowed
		System.out.println(b+a);
		
		// 2. Double
		double d = 22.22;
		double d1 = 100;
		double d3 = 33.33;
		System.out.println(d);
		System.out.println(d1);
		
		// 3. Char
		char c1 = 'A';  // char should be in single cout ''
		char c2 = 'd';
		System.out.println(c2);
		
		// 4. Boolean true or false 
		// IMP Q - boolean - is true and false are the keywords or values?
		// yes they are keywords in java but we can use as values.
		boolean b1 = true; 
		boolean b2 = false;

		// 5. String - is a class in java, it is not a datatype. 
		// We can use as a datatype.
		String s = "Selenium"; // String should be in double cout "".
		
	}

}
