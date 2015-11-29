package com.heap;

public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	public Heap(int mx){
		maxSize=mx;
		currentSize=0;
		heapArray=new Node[maxSize];
	}
	
	public boolean isEmpty(){
		return currentSize==0;
	}
	public boolean insert(int key){
		if(currentSize == maxSize)
			return false;
		Node newNode = new Node(key);
		heapArray[currentSize]=newNode;//新节点放到数组最后
		trickleUP(currentSize);//新节点进行比较向上调整
		currentSize++;
		return true;
	}
	public void trickleUP(int index){//向上调整
		int parent = (index-1)/2;
		Node bottom = heapArray[index];
		while(index>0 && heapArray[parent].getKey()<bottom.getKey()){
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent-1)/2;
		}
		heapArray[index] = bottom;
	}
	
	public Node remove(){//删除根
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];//把最后一个数据项先移到根节点
		trickleDown(0);//把新的根位置的数据项进行比较向下调整
		return root;
	}

	public void trickleDown(int index) {//向下调整
		int largerChild;//大的子节点位置
		Node top = heapArray[index];//要向下调整的节点对象
		while(index < currentSize/2){//如果未找到最后一层
			int leftChild = 2*index + 1;
			int rightChild = leftChild + 1;
			if(rightChild<currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
				largerChild = rightChild;
			else
				largerChild = leftChild;
			if(top.getKey() >= heapArray[largerChild].getKey()) break;
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
	//改变优先级
	public boolean change(int index, int newValue){
		if(index<0 || index>=currentSize) //无效的位置
			return false;
		int oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue<newValue)
			trickleUP(index);
		else
			trickleDown(index);
		return true;
	}
	
	public void displayHeap(){
		System.out.print("HeapArray:");
		for(int m=0; m<currentSize; m++){
			if(heapArray[m]!=null)
				System.out.print(heapArray[m].getKey() + " ");
			else System.out.print("-- ");
		}
		System.out.println();
		
		//以树状方式显示
		int nBlanks=32;//敲空格
		int itemPerRow=1;//每一层数据的个数
		int column=0;
		int j=0;
		String dots="...............................";
		System.out.println(dots+dots);
		while(currentSize>0){
			if(column==0){
				for(int k=0; k<nBlanks;k++)
					System.out.print(' ');
			}
			System.out.print(heapArray[j].getKey());
			if(++j==currentSize) break;//全部打印完成
			if(++column==itemPerRow){//这层数据项打印完
				nBlanks/=2;
				itemPerRow*=2;
				column=0;
				System.out.println();
			}else{
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.print(' ');
			}
		}
		System.out.println("\n"+dots+dots);
	}
}
