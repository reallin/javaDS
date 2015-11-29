package com.queue.priority;

public class PriorityQ {
	private long[] queArray;
	private int maxSize;
	private int nItems;
	public PriorityQ(int s){
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	//排序插入数据项（从小到大，数据项小，则优先级高）
	//(ront->)1、2、3、4、5、6(->
	//Front端进行挪动，rear为queArray下标为0的位置
	public void insert(long item){
		int j;
		if(nItems == 0){
			queArray[nItems++] = item;
		}else{//排序，假设之前的已经排好序，插入排序
			for(j=nItems-1; j>=0; j--){
				if(item > queArray[j])
					queArray[j+1] = queArray[j];
				else 
					break;
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove(){//移除下标最大的
		return queArray[--nItems];
	}
	
	public long peekMin(){
		return queArray[nItems-1];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems == maxSize;
	}
}
