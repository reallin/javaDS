package com.linklist;

public class Link {//Á´½áµã
	public int iData;
	public double dData;
	public Link next;
	public Link(int id, double dd){
		iData = id;
		dData = dd;
	}
	
	public void displayLink(){
		System.out.print("{"+iData+","+dData+"}" );
	}
}
