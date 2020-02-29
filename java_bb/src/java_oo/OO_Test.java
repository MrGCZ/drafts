package java_oo;
import java_oo_sub.*;
//面向对象2
//1.封装 ：该隐藏的隐藏起来，该暴露的暴露出来。
//封装的体现：1.属性private，对外提供set和get方法；2.方法private，仅供内部其他方法调用；3.单例模式
//java规定的4种权限 ,从小到大private,default(不写的话就是这个，不用写default),protected,public
//可以用来修饰类的内部结构：属性、方法、构造器、内部类。

//2.构造方法 constructor
//new Animal()其实就是new+构造器的表达方式
//定义构造器 权限修饰符+类名（形参列表）{}
//#I Found#:子类必须要有一个构造器和父类一致，因为在实例化子类时调用了子类的构造器，之后也会调用父类构造器。
//JavaBean（可重用对象）:满足三个条件则是javabean：1.类是公共的；2.有一个无参的公共构造器；3.有熟悉和对应的get和set方法

//子类默认继承父类的属性和方法，但不会继承父类的构造器.
//子类在创建的时候会调用自己的空构造器，并在空构造器会隐式调用super()，即父类的空构造器。如果父类的构造器被重载，那么子类中的构造器也必须初始化父类的构造器，否则会报编译错误。

//3.this的使用
//this标识当前对象的,或当前正在创建的对象（构造器中）。
//this可以用来修饰、调用：属性、方法、构造器
//1.属性和形参重名时，用于标识属性
//2.在类构造器中使用this(形参)，可以调用本类中其他的构造器。必须申明在当年构造器首行



public class OO_Test {
	public static void main(String[] args) {
		Animal a = new Animal("pig");
		a.age = 3;
		a.setLegs(19);		
		a.showleg();
		
		//protected测试 
		Person1 person1 = new Person1();
		//person1.protectedRun; //会报错：不同包下的普通类（非子类），无法调用protected
		
		SubPerson1 subperson1 = new SubPerson1();
		subperson1.method();
		
		Dog dog1 = new Dog("AA");
		//Dog dog1 = new Dog("AA",123); 子类不存在这个构造器
		
		
	}
}

//protected测试
class SubPerson1 extends Person1{
	public void method() {
		protectedRun(); //只有在不同包（java_oo）的子类（SubPerson1）中，才可以调用它的protected方法 (java_oo_sub.Person1.protectedRun)
	}
}


class Animal{
	//属性
	String name;
	int age;
	private int legs; //private使得属性对外不可见 
	
	//构造器:与类同名
	public Animal(String name) {
		this.name = name;		
	}
	
	public Animal(String name,int age) {
		this(name);  //this使用要点2：2.在类构造器中使用this(形参)，可以调用本类中其他的构造器。申明在首行
		this.age = age;
	}
	
	//方法
	private void eat() {
		System.out.println(name + "==>eat");
	}
	
	//legs只能通过方法修改 
	public void showleg() {
		System.out.println(legs);
		this.eat();   //this也可以省略
	}
	
	//对属性进行private封装后，一般会提供set和get的public方法 
	public void setLegs(int legs) {
		if(legs>=0) {			
			this.legs=legs;  //this的使用要点1：属性和形参重名时，用于标识属性
		}		
	}
	
	public int getlegs() {
		return legs;
	}
}

class Dog extends Animal {
	public Dog(String name) { //子类必须要有一个构造器和父类一致
		super(name);
	}
}