package com.heap.sort;

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
	
	public void insertAt(int index, Node newNode){
		heapArray[index] = newNode;
	}
	
	public void incrementSize(){
		currentSize++;
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
			if(top.getKey() >= heapArray[largerChild].getKey())
				break;
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
	
	public void displayArray(){
		//以数组显示
		System.out.print("HeapArray:");
		for(int m=0; m<maxSize; m++){
			if(heapArray[m]!=null)
				System.out.print(heapArray[m].getKey() + " ");
			else System.out.print("-- ");
		}
		System.out.println();
	}
	
	public void displayHeap(){
		//以树状方式显示
		System.out.println("HeapTree:");
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
