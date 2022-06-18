package oops;

public class StaticNonStatic {

	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
		obj.display();
		StaticNonStatic.add();
	}
	
	public void display() {
		System.out.println("Display method");
	}

	public static void add() {
		System.out.println("Add method");
	}
}
