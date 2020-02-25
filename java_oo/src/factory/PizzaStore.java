package factory;

public abstract class PizzaStore {
	//��������������ֻ���һ���Զ�����Ķ������Ѷ����ʵ�����������࣬����ʵ�ֹ������������಻���Ǵ���������ֶ���
	//���ഴ����Ʒ������ĸ���ʹ�ò�Ʒ�����ഴ�����Ĳ�Ʒ������ͬһ���ӿڡ�
	//ʵ����PizzaStore��Pizza֮��Ľ���
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type); //��pizza�����ʵ������������������������������б���д
		
		//��ʵ����һЩ����������ͳһ�� 
		pizza.prepare();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
	
	
}
