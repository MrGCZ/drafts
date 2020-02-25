package java_array;
//数组，简单的算法
//冒泡排序和快速排序
public class ArrayTest3 {
	public static void main(String[] args) {
		//冒泡排序 从前往后比较相邻元素的大小，小在前大在后，第一次大轮后出现第一大数在最后
		int[] arr = new int[] {2,4,12,21,53,1,231,-10,20,12};
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j < arr.length - i -1;j++) {
				if(arr[j]>arr[j+1]) {
					//交换元素
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		printarray(arr);
				
		//快速排序
		//思想：双指针往中心走，low<pivot或high>pivot则继续，否则交换指针下的数，直到指针重合。把重合位置的数和pivot互换。可以实现pivot左边全比pivot小，右边全比pivot大。
		int[] arr1 = new int[] {2,69,31,21,1,2,9,4,12,21,53,1,231,-10,20,12};	
		quickSort(arr1);
		System.out.println("--------");
		printarray(arr1);
		
	}
	
	public static void printarray(int[] l_array) {
		for(int i=0;i<l_array.length;i++) {
			System.out.println(l_array[i] + "\t");			
		}
	}
	
	public static void swap(int[] data,int i,int j) {
		int temp = data[i];
		data[i] =data[j];
		data[j] =temp;		
	}
	
	//快速排序实现
	public static void subSort(int[] data,int start,int end) {
		if(start < end) {
			int base = data[start];//参与比较的数，第一个数
			int low =start; //low high表示两个指针
			int high =end + 1;
			while (true) {
				//指针向中间移动，当左边小，右边的数大，则继续移动
				while(low < end && data[++low]-base <= 0)
					;
				while(high > start && data[--high]-base >= 0)
					;
				if(low <high) {
					swap(data,low,high);//交换high low指针位置
				}else {
					break;
				}		
			}
			//交换hight指针和base的位置
			swap(data,start,high);
			//base已经放到正确的位置，左边的数比base小，右边比base大
			//递归的思想，分别操作左边和右边的数组
			subSort(data,start,high-1);
			subSort(data,high+1,end);
		}		
	}
	
	public static void quickSort(int[] data) {
		subSort(data,0,data.length-1);
	}
	
}
