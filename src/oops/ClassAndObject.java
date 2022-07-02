package oops;

public class ClassAndObject {
	
	//Non static method
	public void eat() {
		System.out.println("Eat method");
	}
	
	//Non static method
	public void run() {
		System.out.println("Run method");
	}
	
	
	// main method - starting point
		public static void main(String[] args) {
			
		//	How to create an object
			// ClassAndObject - class name 
			// dog - reference variable
			// new ClassAndObject(); - object
			// new - keyword
			// ClassAndObject() - constructor
			ClassAndObject dog = new ClassAndObject();
			ClassAndObject cat = new ClassAndObject();
			
			dog.eat();
			dog.run();
			
			cat.eat();
			cat.run();

		}

}
