package decorater;
//装饰者模式，用condiment装饰beverage
public class CoffeeRun {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + beverage.cost());
		
		beverage = new Mocha(beverage); //用Mocha装饰Espresso
		System.out.println(beverage.getDescription() + beverage.cost());

		beverage = new Mocha(beverage);//装饰两次,双倍Mocha
		System.out.println(beverage.getDescription() + beverage.cost());
		
		
	}

}
