package factory;
//����ϵͳ����ͬ�ĵ�Ĳ�ͬ���Ͷ���
public class PizzaRun {
	public static void main(String[] args) {
		PizzaStore nyStore = new NyPizzaStore();
		PizzaStore chiStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		
		pizza = chiStore.orderPizza("Cheese");
	}
}
