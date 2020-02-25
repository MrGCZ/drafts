package factory;

public abstract class Pizza {
	String	name;
	
	void prepare() {
		System.out.println("Prepare "+name);
	}
	
	void box() {
		System.out.println("Box "+name);
	}
	
	public String getName() {
		return name;
	}
}
