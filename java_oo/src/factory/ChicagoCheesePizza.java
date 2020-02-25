package factory;

public class ChicagoCheesePizza extends Pizza{
	public ChicagoCheesePizza() {
		name = "Chicago Style Cheese Pizza";
		
	}
	
	void box() {
		System.out.println("Chicago Special box "+ name);
	}
}
