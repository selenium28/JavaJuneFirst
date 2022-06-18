package oops;

public class MethodsConcept {

	public static void main(String[] args) {
		//one object will be created, obj is the ref. variable
		//obj - referring to this object --> new MethodsConcept()
		//Once you created the object all the non-static methods will be given to that object.
		
		MethodsConcept obj = new MethodsConcept();
		obj.run();
		obj.sleep();
		obj.walk();
		int c = obj.add(10,20);
		System.out.println(c);
		int d = obj.sleep();
		System.out.println(d);
		int k = obj.divide(100, 10);
		System.out.println(k);
	}

	//void -- doesn't return any value
	// return type -- void
	public void run() {
		System.out.println("Run Method : No Input No OutPut");
	}

	// return type -- int
	public int sleep() {
		System.out.println("Sleep method: No Input some output");
		int a = 10;
		int b = 50;
		int c = a+b;
		
		return c;
	}

	// return type -- String
	public String walk() {
		String j = "Java";
		System.out.println("walk method: No Input some output");
		
		return j;

	}

	// return type -- int
	public int add(int n, int o) {
		int m = n+o;
		
		System.out.println("Add method: Some Input and Some Output");
		return m;
		
	}
	
	// return type -- int
		public int divide(int x, int y) {
			int z = x/y;
			
			System.out.println("Add method: Some Input and Some Output");
			return z;
			
		}

}
