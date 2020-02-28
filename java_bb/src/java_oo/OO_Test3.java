package java_oo;

/*面向对象5
1.static
可以用来修饰属性、方法、代码块、内部类
1.1 static修饰属性为静态变量（类变量），无static修饰的属性 为实例变量。多个对象共享同一个静态变量，某个对象修改静态变量时，会导致其他变量调用时是修改过的。
静态变量随着类的加载而加载(类只加载一次，所以静态变量只存在一份)，早于对象的创建。
1.2 static修饰方法为静态方法，也是随着类的加载而加载。
静态方法中只能调用静态方法或属性，因为非静态的此时还未加载。也就是static方法中不可以用this（当前对象）或super（当前对象的父类）关键字，因为还没有当前对象！
非静态可以调用静态。
共享的数、常量一般申明为static，操作静态变量的方法、工具方法一般申明为静态方法。
1.3应用：单例
在Java中静态方法可以被继承，但是不能被覆盖，即不能重写。
如果子类中也含有一个返回类型、方法名、参数列表均与之相同的静态方法，那么该子类实际上只是将父类中的该同名方法进行了隐藏，而非重写。
父类引用指向子类对象时，只会调用父类的静态方法。所以，它们的行为也并不具有多态性。

2.main()方法
main()作为程序的入口，可以作为和控制台交互的方式

3，代码块（初始化块） 就是一个{}
作用：用来初始化类或对象，对对象的属性进行初始化。只能用static修饰符修饰，不可以用其他的修饰符，分为静态代码块和非静态代码块 
代码块自动执行：静态代码块随着类的加载而执行(只执行一次)，非静态随着对象的创建而执行（每创建一个对象执行一次）。
多个代码块，随着定义的顺序执行

4.final
可以用来修饰类、方法、变量（属性和局部变量）
修饰类：此类不能被继承； 修饰方法：此方法不可以被重写；修饰变量：此变量就成为常量。
static final = 全局常量（修饰属性） 

5.abstract 抽象方法、抽象类
抽象类：1.不可以实例化
抽象方法：1.没有大括号 2.包含抽象方法的类一定是抽象类 3.子类继承父类，需要重写所有的抽象方法才可以实例化，如果没有，则也应该申明为抽象类。
abstract不能修饰私有方法，静态方法，final的方法或类
我的发现：
父类的私有属性和私有方法对于子类来说都是invisible的，所以子类不可以改写父类的私有方法，而要获取父类的私有属性，可以采用调用父类的set/get方法，或者在构造器内用super

6.抽象类的匿名子类 ,不显示申明子类的名称（显式申明如BmwCar）

7.接口 interface 
父类叫继承，接口叫实现。
一个类可以实现多个接口，解决了java多重继承不可用的问题。接口与接口之间可以多继承。
JDK7以前，接口里只能定义全局常量和抽象方法：全局常量 public static final，抽象方法 public abstract
JDK8之后，还可以定义静态方法、默认方法 public static 和 public default（public abstract是缺省）
接口不可以初始化，不可以定义构造器。
类实现接口，需要实现接口所有的抽象方法，此类才可以实例化，否则仍为抽象方法。
知识点：
1.接口中定义的静态方法不能被继承，只能通过接口调用（和类的静态方法不一样）。
2.实现类的对象，可以调用接口中的默认方法。
3.子类C继承父类A实现接口B，A和B都有同名的method1()方法，子类在没有重写此方法的情况下，默认调用的是父类中的同名方法A.method1()==>类优先原则
4.子类C实现接口A和B，A和B都有method1()方法，子类C必须重写method1（）方法，不然会接口冲突

8.内部类:将一个类声明在另一个类中，内部类与外部类
成员内部类 （类里）vs 局部内部类（方法内、代码块内、构造器内）
内部类可以调用外部类的结构，可以被static修饰（一般的类不可以），可以用四种不同的权限修饰protected default private public

*/
public class OO_Test3 {
	public static void main(String[] args) {
		//static
		Chinese.nation = "CHN"; //静态代码块在这里执行
		Chinese.show();
		Chinese a = new Chinese(); //非静态代码块随着对象的创建而执行 
		a.show(); //实例也可以调用静态方法
		Chinese b = new Chinese();
		System.out.println(a.getId());//static使得id自增
		System.out.println(b.getId());
		
		//静态方法可以被子类继承
		Chineseman c =new Chineseman();
		System.out.println("Chineseman show:" );
		c.show();
		
		//main()  run as - run configuration - arguments中可以填入参数 
		for(int i=0;i<args.length;i++) {
			System.out.println("*****" + args[i]);
		}
		

		BmwCar bmw =new BmwCar("X3");
		System.out.println(bmw.getId()); //打印123： 子类获取父类私有属性的方法,调用父类未被改写的getId方法 
		//即使子类申明了id，此时getId返回的仍然是父类的id；但是子类重写getId后，返回的则是子类id
		
		//创建了一个匿名子类的对象
		Car car1 = new Car() {
			@Override
			public void turn() {
				System.out.println("non-name turn");
			}
		};		
		car1.turn();
		
		//interface
		TeslaF t1 = new TeslaF();
		a.takeFlyVehicle(t1); //多态
		t1.takeoff(); //实现类中调用接口的方法 
		
		//内部类
		//实例化内部类对象
		//非静态的内部类需要先实例化外部类，静态的直接 Chinese.Brain brain = new Chinese.Brain()
		Chinese d = new Chinese();
		d.name = "Li";
		Chinese.Brain brain = d.new Brain(); //比较特殊的写法！！！
		brain.think("BigBrain*");
		
		
	}
}


class Chinese { 
	String name;
	int age;
	static String nation;
	private int id;
	private static int init = 1001;//static申明的属性被所有对象共享，自增id的基数
	static String blockname;
	final String skin = "Yellow";
	
	public Chinese() {
		id = init++; //创造一个对象，则id+1
	}
	
	//代码块
	{
		blockname ="non-static";
		System.out.println(blockname + " block run");
	}
	
	static{
		blockname = "static";
		System.out.println(blockname + " block run");
	}
	
	public static void show() {
		System.out.println("I'm a Chinese");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	//接口多态的实现
	public void takeFlyVehicle(FlyEngine flyengine) {
		flyengine.fly();
	}
	
	//成员内部类
	class Brain{
		int capacity; 
		String name = "InnerBrain**";  //this.name
		
		public void think(String name) {
			//内部类可以调用外部类的结构，但是不能加this，要写全的话是Chinese.this.name!
			System.out.println(name //方法的形参 
								+ this.name //内部类的属性
								+ Chinese.this.name //外部类的属性 
								+"'s brain think");
		}
	}
}

class Chineseman extends Chinese{
	
}

//抽象类
abstract class Car{
	String name;
	private int id = 123;
	public Car() {}
	
	public Car(String name) {
		this.name = name;
	}
	//非抽象方法
	public void drive() {
		System.out.println("father drive");
	}
	//抽象方法 没有大括号 
	public abstract void turn();
	
	public int getId() {
		return id;
	}
}

class BmwCar extends Car{
	private int id = 321;
	public BmwCar(String name) {
		super(name);
	}
	
	public void drive() {
		super.drive(); //在子类中调用父类声明的方法
		System.out.println("son drive");
	}
	
	public void turn() {
		System.out.println("turn");		
	}

//	public int getId() {
//		return id;
//	}
}

class TeslaF extends Car implements FlyEngine{
	
	//非抽象类要实现抽象父类和接口所有的抽象方法
	public void turn() {
		System.out.println("turn");		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Tesla Fly");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Tesla Stop");
	}
	
	public void takeoff() {
		FlyEngine.super.takeoff(); //调用接口中的默认方法，还需要声明一下接口名称，比调用父类的方法多这个步骤
		System.out.println("son takeoff");

	}
}

interface FlyEngine{
	//全局常量
	public static final int MAX_SPEED = 100; //public static是默认，也可以省略
	
	//抽象方法 public abstract是默认，也可以省略
	public abstract void fly();
	void stop();
	default void takeoff(){
		System.out.println("interface takeoff");
	}
}

//接口可以继承接口
interface FlyPlaneEngine extends FlyEngine{
	public abstract void getOnBorad();
};