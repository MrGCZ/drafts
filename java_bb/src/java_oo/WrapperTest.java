package java_oo;
//包装类
//基本数据类型、包装类、String三者间的转换

import org.junit.Test;

public class WrapperTest {
	
	//基本数据类型 --》包装类
	@Test //单元测试方法 
	public void test1() {
		int num = 10;
		Integer int1=new Integer(num);
		System.out.println(int1);
		Integer int2=new Integer("123"); //还可以放String 
		Integer int3=3; //自动装箱 java5.0新功能 
		
		
		Float f1 = new Float(12.3f);
		Float f2 = new Float("12.3");
		
		
	}
	
	//包装类 --》基本数据类型
	@Test
	public void test2() {
		Integer int1 = new Integer(12);
		int i1 = int1.intValue();
		
		Float f1 = new Float(12.3);
		float ff1 = f1.floatValue();
		
		int i2 = int1; //自动拆箱 java5.0新功能 
		
	}
	
	//基本数据类型和包装类转换String
	@Test
	public void test3() {
		int num1 = 10;
		//方式1
		String str1 = num1+"";
		//方式2
		String str2 = String.valueOf(num1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1); //valueOf可以传基本数据类型和包装类，因为有自动拆装箱
		
		String str4 = "123";
		int num2 = Integer.parseInt(str4);
		
		String str5 = "true";
		Boolean b1 = Boolean.parseBoolean(str5);
		
		
	}
	
}
