package decorater;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;  //将被装饰者添加到实例变量中 		
	}
	
	public String getDescription() {
		return beverage.getDescription() +", Mocha";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
	
}
