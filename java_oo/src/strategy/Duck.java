package strategy;
//思想 ：变化之处剥离，面向接口编程。 把鸭子的飞行行为通过其他类实现，因为不同的鸭子有不同的飞行行为，如果在duck子类中实现需要重用很多代码。可以把这部分从duck类的实现中剥离出来，新建一个类或接口，
//其子类专门实现鸭子飞行的模式。在duck类中只需要定义出这个实例变量，在其子类中只需要申明实例变量不同的实现方式（申明调用）。
//策略模式：定义一个算法家族，并让这些算法可以互换。因为每一个算法都被封装起来，所以可以客户可以轻易地使用不同的算法。通过对象组合的方式实现。
public abstract class Duck {
		FlyBehavior flyBehavior; //对象的组合 
		
		public Duck(){}
		
		public abstract void display();
		
		public void performFly() {
			flyBehavior.fly();
		}
		
		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}
		
}
