package com.linklist.adt;

public class Link {//Á´½áµã
	public long dData;
	public Link next;
	public Link(long dd){
		dData = dd;
	}
	
	public void displayLink(){
		System.out.print(dData+" ");
	}
}
