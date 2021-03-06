package java_oo;
//面向对象3
//1.继承
//1.1子类继承父类后，子类获取父类所有的属性和方法（包括private属性和方法）
//1.2JAVA只允许子类有一个父类，单继承
//1.3没有显式申明父类的类，此类继承于java.lang.Object类

//2.重写
//2.1要求：
//(1)、子类重写的方法名和形参和父类相同；
//(2).子类重写的方法的权限修饰符不小于父类（private<default<protected<public）
//(3).子类不能重写父类中申明为private权限的方法。父类如果有private方法，子类可以写同名public方法，但此时不叫重写,因为子类此时根本看不到父类的private方法。
//(4)返回值类型 父类是void,子类重写方法也要是void;
//(5)父类返回值是A类，则子类重写方法返回值为A或A类的子类；
//（6）父类是基本数据类型，子类也要是相同的基本数据类型 如double 
//(7)子类重写方法抛出的异常类型不大于父类被重写方法抛出的异常类型。如Exception>RunTime Exception
//(8)static方法不能被覆盖，随着类而被加载，所以不会被重写 

//3.super关键字 ：父类的
//类似于this，可以用来调用：属性、方法、构造器  
//this.先从子类开始找，没找到去父类找，super.直接从父类开始找
//属性和方法：当子类和父类中定义了同名的属性或子类重写父类方法时 ，我们想要在子类中调用父类中申明的属性和方法，必须显示的使用super.
//构造器：可以在子类构造器中显式super（形参列表），调用父类的构造器，必须写在首行。在构造器首行没有申明super或this时，默认执行super()(空参构造器)

//4.子类对象实例化的过程 
//(1)从结果上看，子类继承父类时，就获取了父类中申明的属性或方法，在对空间中加载所有父类的属性。
//(2)从过程上来看，构造器在创建子类对象时，我们一定会直接super()或间接this()调用父类的构造器，父类再调用父类，直到java.lang.object为止。
//虽然创建子类对象时调用父类构造器，但只创建出一个对象，即为new的对象。

public class OO_Test1 {
	public static void main(String[] args) {
		//private属性的继承 
		Student a = new Student("Tom","Math");
		a.setAge(18);
		System.out.println(a.getAge());
		
		//override
		a.eat();
		a.publicshow();  //I am a Person
		//show()调用的仍是父类的，“重写”失败 
				
		//super关键字，调用父类的方法 
		a.fatherEat();
		a.showHeight();
		//调用父类的构造器
		System.out.println(a.major);
		
	}
}

class Person{
	String name;
	private int age;  //private属性也可以被继承，继承后也是private属性,不可以直接调用'
	int height = 170;
	
	public Person(String name){
		this.name = name;
	}
	
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;		
	}
	
	private void show() {
		System.out.println("I am a Person");
	}
	
	//注意，如果继承的话，show（）方法调用的仍然是父类的，无论子类有没有“重写”
	public void publicshow() {
		this.show();
	}
}

class Student extends Person{ //extends继承 
	public int stuid;
	String major;
	int height = 180;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	//重写 override 要求 方法名和形参列表和父类一样 
	public void eat() {
		System.out.println("eat a lot");
	}
	
	//super关键字调用父类中的eat（）
	public void fatherEat() {
		super.eat();
	}
	
	//注意不是重写，而是重写定义show()
	public void show() {
		System.out.println("I'm a Student");
	}
	
	public void showHeight() {
		System.out.println(this.height+"---"+super.height);
	}
	
}