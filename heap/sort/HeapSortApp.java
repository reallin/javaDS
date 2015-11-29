package com.heap.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HeapSortApp {
	public static void main(String[] args) throws IOException{
		int size,j;
		System.out.print("Enter number of items:");
		size = getInt();
		Heap theHeap = new Heap(size);
		for(j=0; j<size; j++){
			int random = (int) (java.lang.Math.random()*100);
			Node newNode = new Node(random);
			theHeap.insertAt(j, newNode);//把随机生成的数字创建成节点后按照顺序放到堆中
			theHeap.incrementSize();//数量递增
		}
		//将随机生成无序的数组显示出来看一下
		System.out.println("Random:");
		theHeap.displayArray();
		theHeap.displayHeap();
		
		//从最后一个元素的父节点开始向下调整，一直到根
		//调整完后就要变成标准的堆
		for(j=size/2-1; j>=0; j--)
			theHeap.trickleDown(j);
		//将堆显示出来看一下
		System.out.println("Heap:");
		theHeap.displayArray();
		theHeap.displayHeap();
		
		//通过循环删除最大项，再把删除的数据放入数字中指定的位置
		//得到一个从小到大有序的数组
		for(j=size-1; j>=0; j--){
			Node biggstNode = theHeap.remove();
			theHeap.insertAt(j, biggstNode);
		}
		//将堆排序显示出来看一下
		System.out.println("Sorted Heap:");
		theHeap.displayArray();
	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
		
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}
