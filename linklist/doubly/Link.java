package com.linklist.doubly;

public class Link {//Á´½áµã
	public long dData;
	public Link next;
	public Link previous;
	public Link(long dd){
		dData = dd;
	}
	
	public void displayLink(){
		System.out.print(dData+" ");
	}
}
