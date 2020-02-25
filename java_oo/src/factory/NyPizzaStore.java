package factory;

public class NyPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		if (item.equals("Cheese")) {
			return new NyStyleCheesePizza();
		} else return null;
	}
}
