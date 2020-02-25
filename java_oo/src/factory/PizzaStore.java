package factory;

public abstract class PizzaStore {
	//工厂方法：父类只完成一个对对象处理的动作，把对象的实例化交给子类，子类实现工厂方法，父类不考虑处理具体哪种对象。
	//子类创建产品，抽象的父类使用产品。子类创建出的产品必须有同一个接口。
	//实现了PizzaStore和Pizza之间的解耦
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type); //对pizza对象的实例化交给抽象函数，这个函数在子类中被改写
		
		//对实例的一些处理，这里是统一的 
		pizza.prepare();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
	
	
}
