package com.linklist.adt;

public class LinkListStack {
	private LinkList theList;
	public LinkListStack(){
		theList = new LinkList();
	}
	
	public void push(long j){
		theList.insertFirst(j);
	}
	
	public long pop(){
		return theList.deleteFirst();
	}
	
	public boolean isEmpty(){
		return theList.isEmpty();
	}
	
	public void displayStack(){
		System.out.print("Stack(top-->bottom):");
		theList.displayLinkList();
	}
}
