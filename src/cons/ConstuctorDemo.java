package cons;

public class ConstuctorDemo {
	
	// Execution sequence:
	// Static ---> main method() --> Block ---> (main method) Once you created the object --> automatically Constructor  --> method
	
	static 
	{
		System.out.println("I'm inside the static block");
	}

	public static void main(String[] args) {
		ConstuctorDemo obj = new ConstuctorDemo();
		obj.add();
		System.out.println("Main method");
	}
	
	void add() {
		System.out.println("I'm inside the add method");
	}
	
	ConstuctorDemo(){
		System.out.println("I'm inside the Constuctor Demo");
	}
	
	{
		System.out.println("I'm inside the Open and close bracket");
	}
	
	{
		System.out.println("I'm inside the Open and close second bracket");
	}

}
