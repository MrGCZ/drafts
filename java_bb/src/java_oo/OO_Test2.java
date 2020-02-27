package java_oo;
//面向对象4
//1.多态 ： 父类的引用指向子类的对象  
//1.1多态的使用:在编译期，只能调用父类声明的方法，在运行期，我们执行的是子类重写父类的方法。编译向走，运行向右（只针对方法）。
//多态的使用也叫动态绑定（晚绑定），在编译时完全不知道传入的是什么类型，只知道它的父类是什么。只有等到方法调用的那一刻，解释运行器才知道具体要调用什么方法。


//2.关键字
//2.1 (Man)强制类型转换符 & instanceof
//Human p1 = new Man();内存中其实已经有Man的属性和类型的，但是由于申明为父类类型，所以不能调用子类特有的属性和方法。
//要调用特有的：可以使用强制类型转换符 如 （Man）p1。如果强转类型指定错误，如(Woman)p1，编译可以通过，但运行的时候报错。
//可以配合instanceof使用防止报错,先判定是什么类型 
//强转的两个类型必须要是子父类的关系，不然编译无法通过

//3.java.lang.Object类的使用
//3.1 Object类是所以Java类的根父类
//3.2 Object类中的功能；方法：equal(),toString(),getClass(),hashCode(),clone()等
//equals()和==区别：
//==是运算符，用于基本数据，比较数值是否相等  （无论是否类型相同 double 10.0 == int 10）；用于引用类型，比较地址是否相等
//equals()是方法，可以被对象调，不可以被基本数据类型调用。Object类中定义的equals（）方法和==一致。
//String Date File等包装类中都重写了equals()方法，不再比较引用地址是否相同，而是比较对象的内容是否相同。
//toString（）
//输出一个对象的引用时system.out.println(object)其实就是调用该对象的toString()方法。Object的toString方法定义如下：
/*public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}*/
//String Date File类都重写了toString()方法


public class OO_Test2 {
	public static void main(String[] args) {
		//多态性：子类对象的多态性，父类的引用指向子类的对象 
		Human p1 = new Man();
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
		p1.eat(); //调用的是子类的方法
		//p1.earnMoney(); //通不过编译，编译器认为它是Person，所以不能调用子类特有的方法或属性
				
		System.out.println(p1.id);//居然是1001，Human父类的属性值。多态只适用于方法，不适用于属性
		
		System.out.println("------");
		Human p2 = new Woman();
		p1.eatWith(p2);
		
		//强制类型转换
		if(p1 instanceof Man) { //父类 p1 instanceof Human 也返回true 
			Man p11 = (Man)p1;
			p11.earnMoney();
		}
		
		
		//Object类的使用
		Human human = new Human();
		System.out.println(human.getClass().getSuperclass());
		//equals()
		String str1 = new String("abc");
		String str2 = new String("abc");
		p1.name = "TOM";
		p2.name = "SANDY";
		System.out.println(p1.equals(p2));	//false ：如果不该写，使用的是Object的equals()方法
		System.out.println(str1.equals(str2)); //true ：在String对象中，equals（）被改写为比较内容。
		p2.name = "TOM";
		System.out.println(p1.equals(p2));	//true


	}
}

class Human{
	String name;
	int age; 
	int id = 1001; //用于测试多态的时候属性选择问题 
		
	public void eat() {
		System.out.println("eat");
	}
	
	public void walk() {
		System.out.println("walk");
	}
	
	public void eatWith(Human human) {
		human.eat();
		this.eat();
	}
	
	//重写equals()方法  简写版，不考虑null的情况，null会导致空指针
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		
		if(object instanceof Human) {
			Human hum = (Human)object;
			//比较两个人名字是否一样，这里不能用 == ！否则去比较String的地址
			if(this.name.equals(hum.name)) {
				return true;
			}else {return false;}
		}
		return false;
		
	}
	
}


class Man extends Human{
	
	int id = 1002;
	
	public void eat() {
		System.out.println("man eat");
	}
	
	public void walk() {
		System.out.println("man walk");
	}
	
	public void earnMoney() {
		System.out.println("earn money");
	}
}


class Woman extends Human{
	boolean isBeauty;
	
	public void eat() {
		System.out.println("woman eat");
	}
	
	public void walk() {
		System.out.println("woman walk");
	}
	
	public void goShopping() {
		System.out.println("go shopping");
	}
}