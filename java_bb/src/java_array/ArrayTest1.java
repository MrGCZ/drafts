package java_array;
//数组基础2
public class ArrayTest1 {
	public static void main(String[] args) {
		//array的复制
		int[] array1 = new int[] {1,2,3,4,5};
		printarray(array1);
		int[] array2;
		array2 = array1; //这不是复制，而是让指针指向同一对象
		array2[0] = 100;
		printarray(array1);//array1 和 array2指向同一个array，所以array1 array2都被修改
		
		//真正数组的复制
		int[] array3 = new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		
		//数组的反转；先定义一个临时变量
		for(int i=0;i<array1.length/2;i++) {
			int temp = array1[i];
			array1[i] = array1[array1.length-i-1];
			array1[array1.length-i-1] = temp;
		}		
		printarray(array1);		
		//法二
		for(int i=0,j=array1.length-1;i<j;i++,j--) {
			int temp = array1[i];
			array1[i] = array1[j];
			array1[j] = temp;
		}
		//其他内容： == 和 equals的区别
		String i = new String("abc");
		String j = new String("abc");
		System.out.println(i==j); //false ==比较对象的地址
		System.out.println(i.equals(j)); //比较对象的内容
		
		//二分法查找
		int[] arr1 = new int[] {-50,1,2,3,4,5,6,7,8,9,100,111,1231};		
		int dest1 = 7;		
		int head = 0;
		int end = arr1.length - 1;
		boolean isFlag = true;

		while(head <= end) {
			int middle = (head + end)/2;
			if(dest1 == arr1[middle]) {
				System.out.println("位置为：" + middle);				
				isFlag = false; //是否在中途找到
				break;
			}else if(arr1[middle]>dest1) {
				end = middle -1;
			}else {
				head = middle + 1;
			}
		}
		
		
	}
	
	public static void printarray(int[] l_array) {
		for(int i=0;i<l_array.length;i++) {
			System.out.println(l_array[i] + "\t");			
		}
	}
	
}
