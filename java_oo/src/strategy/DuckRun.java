package strategy;

public class DuckRun {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.display();
		
		//��������
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}
	
}
