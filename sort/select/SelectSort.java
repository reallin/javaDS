package com.sort.select;

public class SelectSort {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,33,88,2,5,7};
		array = select(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	
	/*
	 * 选择排序
	 * 一趟下来，找到最小值，将最小值放在首位
	 * outer(min)=0,inner=1=outer+1
	 */
	private static int[] select(int[] array){
		int outer, inner, min;
		for(outer=0; outer<array.length-1; outer++){
			min = outer;//初始化min指针的索引
			for(inner=outer+1; inner< array.length; inner++){
				if(array[inner] < array[min])
					min = inner;//只查找最小值，不交换，一趟比较结束后，找到最小值，再进行交换。
			}
			int temp = array[outer];
			array[outer] = array[min];
			array[min] = temp;
		}
		return array;
	}
}
