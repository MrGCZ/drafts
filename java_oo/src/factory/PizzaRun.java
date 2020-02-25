package factory;
//订单系统，不同的店的不同类型订单
public class PizzaRun {
	public static void main(String[] args) {
		PizzaStore nyStore = new NyPizzaStore();
		PizzaStore chiStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		
		pizza = chiStore.orderPizza("Cheese");
	}
}
