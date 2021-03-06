package java_array;
//数组基础1
public class ArrayTest {
	public static void main(String[] args) {
		//1.一维数组的初始化
		//1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
		int[] ids; //申明
		ids = new int[] {1,2,3,4};
		//1.2动态初始化
		String[] names = new String[5];
		//数组一旦确定，长度不可以更改
		
		//2.调用数组指定位置元素
		names[0] = "James";
		names[1] = "Curry";
		names[2] = "Anthony";
		//字符串索引
		System.out.println(names[2].charAt(0));
		
		
		//3.如何获取数组的长度
		System.out.println("lengths:" + names.length);
		
		//4.如何遍历数组
		for (int i = 0; i< names.length;i++) {
			System.out.println(names[i]);
		}
		
		//5.数组元素的默认初始化值
		/*
		 * 主数据类型
		 *数组元素是整形 int long short 默认值是0
		 *数组是浮点型 double float ==》 0.0
		 *数组是char ==> 0
		 *boolean ==》 false
		 *
		 *引用数据类型，如String ==> null 
		 */
		int[] arr =new int[4];
		for (int i = 0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		char[] char1 =new char[4];
		char1[1] = 'a';
		for (int i = 0;i< char1.length;i++) {
			System.out.println(char1[i]);
		}
		
		
		//二维数组
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		String[][] arr2 = new String[3][2];
		//特殊的初始化方法：
		String[][] arr3=new String[3][];
		arr3[1]=new String[4];
		System.out.println(arr3[1][0]);
		//二维数组的默认值为一个地址值,指向一维数组的地址
		System.out.println(arr2[1]); //[Ljava.lang.String;@2f92e0f4
		//特殊的初始化 方法，返回值为null
		String[][] arr4=new String[3][];
		System.out.println(arr4[1]);
		
		
	}
	
}
