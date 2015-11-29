package com.linklist.adt;
/**
 * ¡¥±Ì µœ÷’ª
 */
public class LinkList {
	public Link first;
	public LinkList(){
		first = null;
	}
	
	public void insertFirst(long dd){
		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public long deleteFirst(){
		Link tmp = first;
		first = first.next;
		return tmp.dData;
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
