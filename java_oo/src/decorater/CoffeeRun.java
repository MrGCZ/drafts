package decorater;
//װ����ģʽ����condimentװ��beverage
public class CoffeeRun {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + beverage.cost());
		
		beverage = new Mocha(beverage); //��Mochaװ��Espresso
		System.out.println(beverage.getDescription() + beverage.cost());

		beverage = new Mocha(beverage);//װ������,˫��Mocha
		System.out.println(beverage.getDescription() + beverage.cost());
		
		
	}

}
