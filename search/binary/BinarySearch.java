package com.search.binary;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,4,6,8,10,13,16};
		int result = binarySearch(array, 0 , array.length-1, 20);
		int result2 = binarySearchRec(array, 0 , array.length-1, 16);
		if(result == array.length)
			System.out.println("没找到");
		else
			System.out.println("找到了: " + result);
		if(result2 == array.length)
			System.out.println("没找到");
		else
			System.out.println("找到了: " + result2);
	}
	
	//二分查找
	private static int binarySearch(int[] array, int lower, int upper, int searchKey){
		int lowerBound, upperBound, currentIn;
		lowerBound = lower;
		upperBound = upper;
		while(true) {
			currentIn = (lowerBound + upperBound)/2;
			if(array[currentIn] == searchKey)
				return currentIn;
			else if(lowerBound > upperBound)//没有找到
				return array.length;//返回大于最大索引
			else{
				if(array[currentIn] < searchKey)
					lowerBound = currentIn+1;
				else
					upperBound = currentIn-1;
			}
		}
	}
	
	//递归二分查找
	private static int binarySearchRec(int[] array, int lower, int upper, int searchKey){
		int currentIn;
		currentIn = (lower + upper)/2;
		if(array[currentIn] == searchKey)
			return currentIn;
		else if(lower > upper)
			return array.length;//返回大于最大索引
		else{
			if(array[currentIn] < searchKey)
				return binarySearchRec(array, currentIn+1, upper, searchKey);
			else
				return binarySearchRec(array, lower, currentIn-1, searchKey);
		}
	}
}
