package java_oo;

/*面向对象5
1.static
可以用来修饰属性、方法、代码块、内部类
1.1 static修饰属性为静态变量（类变量），无static修饰的属性 为实例变量。多个对象共享同一个静态变量，某个对象修改静态变量时，会导致其他变量调用时是修改过的。
静态变量随着类的加载而加载(类只加载一次，所以静态变量只存在一份)，早于对象的创建。
1.2 static修饰方法为静态方法，也是随着类的加载而加载。
静态方法中只能调用静态方法或属性，因为非静态的此时还未加载。也就是static方法中不可以用this（当前对象）或super（当前对象的父类）关键字，因为还没有当前对象！


*/
public class OO_Test3 {
	public static void main(String[] args) {
		Chinese.nation = "CHN";
		Chinese.show();
	}
}


class Chinese {
	String name;
	int age;
	static String nation;
	
	public static void show() {
		System.out.println("I'm a Chinese");
	}
	
}
