package template;
//模板方法：在一个方法中定义一个算法骨架，而将一些步骤延迟到子类实现。子类重新定义算法中的某些步骤。
public abstract class AbstractClass {
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1(); //子类必须实现，且子类有不同的实现
	
	abstract void primitiveOperation2();
	
	final void concreteOperation() {} //子类无需实现，子类是共同的实现，继承父类
	
	void hook() {} //勾子，子类可以实现，也可以不实现。
	
}
