package java_basic;
import java.io.*;
import org.junit.Test;

//异常处理：分为编译时异常和运行时异常
//抓抛模型：抛：出现异常（自动或手动）会抛出一个异常类的对象；抓：通过try catch finally或throws去抓这个异常对象。
//方式一：try-catch(Exception e)-finally结构：
//1.finally是可选的,表示一定会执行的代码,即使try中有return语句，catch中有return语句或catch中继续有报错的情况；先执行finally再return或继续报错！
//像数据库连接，输入输出流，网络编程socket，JVM不能自动回收，需要手动的进行资源释放，声明在finally中。
//2.catch报错类型的子类在父类上,不然会报错;
//3.try结构中声明的变量，出了try结构后，不能再被调用,所以如果在try之外要使用的变量，可以声明在try外面，赋值在try里面！
//方式二：throws + 异常类型 
//把异常抛给上一级（调用者）处理，可以直到main方法，本质上异常并没有被解决，只是转抛给调用者。

//子类重写的方法的抛出异常类型不大于父类被重写的方法抛出的异常类型。

//方法一 方法二如何选择
//(1)如果父类被重写的方法没有throws，子类重写的方法也不用throws，而用try catch finally
//(2)执行的方法a中，先后又调用了几个方法，这几个方法是递进关系执行的，可以使用throws,而最终在方法a中 try catch finally。只用处理一次

//手动抛出异常 throw （注意：没有s！）


public class ExceptionTest {
	
	//try - catch - finally 结构 
	public static void main(String[] args) {
		String str = "123";
		str = "abc";
		try {
			int num = Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("First exception capturer NumberFormatException");
			int a = 1/0;  //这里继续报错，但是仍会执行finally，执行完finally再报错！ 
		}catch(Exception e) {
			System.out.println("last exception capturer");
		}finally {
			System.out.println("That's finally！！！");
		}
	}
	
	
	//throws的用法 
	//method2承接method1所有的throws
	public void methond2() throws IOException{ //IO是FileNotFound的父类，可以只写一个。可以继续往上抛，谁承接谁写try catch 
		method1();
	}
	
	public void method1() throws FileNotFoundException,IOException {

			File file = new File("abc.txt"); //相对路径，相当于在当前工程下 
			FileInputStream fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}

		    fis.close(); //输入输出流声明在finally中 
	}
	

	//编译时异常*****************************
	//编译时异常连编译都通不过，必须显示的捕捉异常
	//FileNotFoundException
	@Test
	public void test7() {
		//try结构中声明的变量，出了try结构后，不能再被调用,所以如果在try之外要使用的变量，可以声明在try外面，赋值在try里面！
		//这里的fis在finally里仍需要使用
		FileInputStream fis = null;
		try {
			File file = new File("abc.txt"); //相对路径，相当于在当前工程下 
			fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
		}catch(FileNotFoundException e) { //不catch异常的话，编译无法通过
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) //避免空指针异常
				fis.close(); //输入输出流声明在finally中 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//运行时异常******************************
	//ArithmeticException
	@Test
	public void test6() {
		int a =10;
		int b =0;
		int c = a/b;
	}
	
	//NumberFormatException
	@Test
	public void test5() {
		String str = "abc";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException 类转换错误
	@Test
	public void test4() {
		Object obj = new Integer(12);
		String str = (String)obj;
	}
	
	//StringIndexOutOfBoundException
	@Test
	public void test3() {
		String str ="abc";
		System.out.println(str.charAt(3));
			
	}
	
	//ArrayIndexOutOfBoundException
	@Test
	public void test2() {
		int[] arr = new int[2];
		System.out.println(arr[2]);
			
	}
	
	//NullPointerException
	@Test
	public void test1() {
		int[] arr = null;
		System.out.println(arr[1]);
	}
	
}

//子类重写方法抛出的异常应该是父类抛出异常的子类（FileNotFound是IO的子类），因为要满足多态的要求，父类catch的异常要包含子类。
class SuperClass{
	public void method() throws IOException{
		
	}
}

class SubClass extends SuperClass{
	public void method() throws FileNotFoundException{
		
	}
}


//手动抛出异常
class Student{
	private int id;
	
	public void register(int id) {
		if(id > 0 && id <100) {
			this.id = id;
		}else if(id < 0) {
			//手动抛出一个异常对象,运行时异常。如果声明的是Exception（包含编译时异常）需要显式抓异常。
			throw new RuntimeException("illegal id!");
		}else {
			throw new IdLargeThanThresholdException("Too Large id");			
		}
	}
}

//自己定义exception
//1.继承异常类型 2.提供全局常量 serialVersionUID 3.提供重载构造器 
class IdLargeThanThresholdException extends RuntimeException{
	
	static final long serialVersionUID = -7348971191345266939L; //这个exception类的唯一标识
	
	public IdLargeThanThresholdException() {
		
	}
	
	public IdLargeThanThresholdException(String msg) {
		super(msg);
	}
	//可以通过在catch里 e.getMessage()获取这里的msg信息 
	
}