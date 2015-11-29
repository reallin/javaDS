package com.linklist.firstlast;
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
	
	public void insertFirst(long dd){
		Link newLink = new Link(dd);
		if(isEmpty()){
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
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
	
	public Link find(int key){
		Link current = first;
		while(current.dData!=key){
			if(current.next==null)
				return null;
			else
				current=current.next;
		}
		return current;
	}
	
	public Link delete(int key){
		Link current = first;
		Link previous = first;
		while(current.dData != key){
			if(current.next == null){
				return null;
			}else{
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}
	
	public void displayLinkList(){
		System.out.print("List(first-->last):");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
