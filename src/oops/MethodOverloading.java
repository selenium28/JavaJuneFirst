package oops;

public class MethodOverloading {
	
	// MethodOverloading --> When the method name is same with diff input parameters within the same class.
	// Duplicate methods not allowed in Java
	// Method inside the method is not allowed in java.
	// Can we overload main method?  --> Yes we can but can't do this 

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.display(10);
		obj.display(50, 100);
//		main();
	}
	
//	public static void main() {
//		System.out.println("Second main method");
//	}
	
	public void display() {  // 0 parameter
		System.out.println("0 Parameters");
		
	}
	
	public void display(int i) { // 1 parameter 
		System.out.println("1 Parameters");
		System.out.println(i);
	}
	
	public void display(double d) { // 1 parameter 
		System.out.println("1 Parameters");
		System.out.println(d);
	}
	
	public void display(int m, int n) { // 2 parameter 
		System.out.println("2 Parameters");
		System.out.println(m+n);
	}

}
