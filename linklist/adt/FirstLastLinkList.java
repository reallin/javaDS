package com.linklist.adt;
/**
 * Ë«¶ËÁ´±í
 *
 */
public class FirstLastLinkList {
	public Link first;
	public Link last;
	public FirstLastLinkList(){
		first = null;
		last = null;
	}
	
	public void insertLast(long dd){
		Link newLink = new Link(dd);
		if(isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public long deleteFirst(){
		long temp = first.dData;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void displayLinkList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
