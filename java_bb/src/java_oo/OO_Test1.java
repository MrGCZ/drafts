package java_oo;
//面向对象3
//1.继承
//1.1子类继承父类后，子类获取父类所有的属性和方法（包括private属性和方法）
//1.2JAVA只允许子类有一个父类，单继承
//1.3没有显式申明父类的类，此类继承于java.lang.Object类

//2.重写
//要求：(1)、子类重写的方法名和形参和父类相同；(2).子类重写的方法的权限修饰符不小于父类（private<default<protected<public）
//(3).子类不能重写父类中申明为private权限的方法。父类如果有private方法，子类可以写同名public方法，但此时不叫重写

public class OO_Test1 {
	public static void main(String[] args) {
		Student a = new Student();
		a.setAge(18);
		System.out.println(a.getAge());
		//override
		a.eat();
		a.publicshow();
	}
}

class Person{
	String name;
	private int age;  //private属性也可以被继承，继承后也是private属性,不可以直接调用
	
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
	
	public void publicshow() {
		this.show();
	}
}

class Student extends Person{
	public int stuid;
	String major;
	
	//重写 override 要求 方法名和形参列表和父类一样 
	public void eat() {
		System.out.println("eat a lot");
	}
	
	public void show() {
		System.out.println("I'm a Student");
	}
}