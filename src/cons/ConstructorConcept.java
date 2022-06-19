package cons;

public class ConstructorConcept {

	public static void main(String[] args) {
		ConstructorConcept abc = new ConstructorConcept();

	}
	
	// Constructor name must be same as class name.
	// Constructor dosn't have return type.
	// We can use public, private and protected in constructor
	
	// keywords -->static, abstract and final --> error: Illegal modifier for the constructor in type ConstructorConcept; 
	// only public, protected & private are permitted
	
	private ConstructorConcept() {
		System.out.println("I'm in Constructor");
		sum();
	}
	
	private void sum() {
		System.out.println("I'm inside method");
	}

}
