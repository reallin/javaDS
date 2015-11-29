package com.linklist.adt;

public class FirstLastLinkListQueue {
	private FirstLastLinkList theList;
	public FirstLastLinkListQueue(){
		theList = new FirstLastLinkList();
	}
	
	public boolean isEmpty(){
		return theList.isEmpty();
	}
	
	public void insert(long j){
		theList.insertLast(j);
	}
	
	public long remove(){
		return theList.deleteFirst();
	}
	
	public void displayQueue(){
		System.out.print("Queue(front-->rear):");
		theList.displayLinkList();
	}
}
