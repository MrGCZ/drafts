package java_oo;
//面向对象1
//类的属性、局部变量、类的方法
//类的使用中一些需要注意的点 

public class UserTest {
	public static void main(String[] args) {
		User usera = new User();
		
		
		System.out.println(usera.name_in);		
		usera.age = 18;
		System.out.println(usera.getAge());
		
		//匿名对象的使用 没有显式赋给一个变量 
		new User().talk("Chinese"); 
		new User().age= 22;
		System.out.println(new User().getAge());//只能调一次，再次调用时则是新的对象
		
		//可变个数形参
		usera.showMany(3,"James","Wade","Curry");
		
		//方法参数传递机制！（难点）
		//如果变量是基本数据类型，此时赋值的是变量所保存的数据值；如果变量是引用类型，此时赋值的是变量所保存的数据的地址值。
		//对于基本类型（主类型）的变量，以下操作相当于复制一个，这是有两个变量。
		int a = 10;
		int b = a;
		System.out.println(a+"--"+b);
		a = 20;
		System.out.println(a+"--"+b);
		//但是对于引用数据类型以上的操作相当于把两个引用类型变量指向同一个对象（地址值相同），这时只有一个对象，两个都会边。		
		int m = 10;
		int n = 20;
		usera.swap(m,n);
		System.out.println(m+"--"+n);
		//为什么没有交换成功？实参传给形参的是真实储存的数据类型，swap中有一份m和n独立于main中的m和n，当swap执行完后m和n弹出栈，不会影响main中的m和n
		
		Data data = new Data();
		data.m = 10;
		data.n = 20;
		usera.swap(data);
		System.out.println(data.m+"-data-"+data.n);//交换成功！！
		//实参传给形参的是堆空间中的地址，实参和形参同时指向这个对象的地址，交换操作使得对象改变，所以交换可以成功！
		//函数结束后，形参变量弹出，但是仍有变量指向这个对象
		
		
		
	}	
}

class User{
	//属性（或成员变量） 定义在类的一对{}内
	//1.有默认值 null 0 false等	
	//2.可以申明属性，指明其权限修饰符，局部变量的权限和修饰符由方法指定。
	//3.加载到堆
	private String name;
	public int age;
	public String name_in;
	
	public User(){
		this.name_in = "abc"; //this可以指定为这个类的成员变量，如果不加this只是一个局部变量，无法通过实例.属性进行访问。
		
	}
	
	//局部变量 ：定义在方法内、方法形参、代码块内、构造器形参、构造器内部的变量。
	//1.没有默认值,需要显式赋值。
	//2.不可以使用权限修饰符
	//3.加载到栈
	public void talk(String language) { //language形参，也是局部变量
		String food = "turkey"; //局部变量
		System.out.println(language + food);
	}
	
	//方法：
	//1.方法的使用中，可以调用当前累的属性或者方法
	//2.方法中不可以定义方法
	public int getAge() {
		return age;
	}
	
	//方法的重载:同名方法，参数类型或者参数个数不同，则构成重载，只和方法名和参数列表有关，和其他如返回值类型、权限修饰符、形参名称无关
	public void talk(int number) {
		System.out.println("Another talk" + number);
	}
	
	//可变个数的形参：允许直接定义能和多个实参相匹配的形参
	//格式：数据类型 ...,必须申明在末尾!
	//不可以再申明方法 public void showMany(String[], strs)，不构成重载，不能共存(其实这是历史版本需要传入多参数的写法)
	//public void showMany(String, strs) 可以构成重载
	public void showMany(int a,String ... strs) {
		//遍历所有的形参
		for(int i=0;i < strs.length;i++) {
			System.out.println("showMany:" + strs[i]);
		}
	}
		
	//方法参数的值传递机制！
	/*
	 * 形参：方法定义时，申明的小括号内的参数
	 * 实参：方法调用时实际传递给形参的数据
	 */
	
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n =temp;
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
	
		
	 
	
	
}



class Data{
	int m;
	int n;
}
