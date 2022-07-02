package inheri;

public class Dog extends Cat{
	
	// Inheritance--> It is inheriting the properties of parent class into child class is known as Inheritance in Java
	// Method Overriding--> When same method is present in parent class as well as in child class
	// with same no of parameters is known as method overriding.
	
	public void eat() {  // overrides inheri.Cat.eat()
		System.out.println("eat method---- Dog");
	}
	
	public void nonVeg() {
		System.out.println("nonVeg method---- Dog");
	}

}
