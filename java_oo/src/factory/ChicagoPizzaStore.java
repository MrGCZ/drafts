package factory;

public class ChicagoPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		if (item.equals("Cheese")) {
			return new ChicagoCheesePizza();
		} else return null;
	}
}
