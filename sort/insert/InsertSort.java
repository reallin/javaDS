package com.sort.insert;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,33,88,2,5,7};
		array = insert(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}

	/*
	 * 插入排序
	 * 把前面的元素看做已排序序列
	 * 当前元素与前面元素比较，比前面元素小，则进行交换
	 * temp存放当前位置的元素值
	 * 指针一直移动，直到当前元素比前一个数据大，即找到当前元素的排序位置
	 */
	private static int[] insert(int[] array) {
		int outer, inner;
		for(outer=0; outer<array.length; outer++){
			int temp = array[outer];//记录当前元素的值，而不是位置，因为当前位置上的数据可能会被交换数值
			inner = outer;
			while(inner>0 && array[inner-1]>temp){//inner>0必须在temp < array[inner-1]前面
				//还没找到位置，指针向前走
				array[inner] = array[inner-1];//会一直交换
				inner--;
			}
			array[inner] = temp;
		}
		return array;
	}
}
