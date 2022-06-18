package oops;

public class GlobalVariableLocalVariable {
	
	int num = 200;	// Global Veriable - non-static
	static String str = "Dev";    // Global Variable - static

	public static void main(String[] args) {
		
		GlobalVariableLocalVariable obj = new GlobalVariableLocalVariable();
		System.out.println(obj.num);
		System.out.println(obj.sum());
		
		// direct calling -- static methods and static variables
		// call by using class name 
		GlobalVariableLocalVariable.display();
		System.out.println(GlobalVariableLocalVariable.str);

	}
	
	public int sum() {
		int a = 10;   // local variable
		int b = 20;	 // local variable
		int c = a+b;
//		System.out.println(a+b);
				return c;
	}
	
	public static void display() {
		int i = 100;	// local variable
		System.out.println(i);
		
		System.out.println("Display method "+GlobalVariableLocalVariable.str);
//		System.out.println("Adding in display method: "  +(GlobalVariableLocalVariable.num+i));
	}

}
