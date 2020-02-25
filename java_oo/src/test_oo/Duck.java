package test_oo;

public class Duck {
	int size;
	
	public void setSize(int newSize) {
		size = newSize;		
	}
	
	public static void main(String[] args) {
		Duck d = new Duck();
		d.setSize(100);
		System.out.println(d.size); 
	}
}
