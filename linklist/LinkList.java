package com.linklist;

public class LinkList {
	public Link first;
	public LinkList(){
		first = null;
	}
	
	public void insertFirst(int id, double dd){
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public Link deleteFirst(){
		Link tmp = first;
		first = first.next;
		return tmp;
	}
	
	public Link find(int key){
		Link current = first;
		while(current.iData!=key){
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
		while(current.iData != key){
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
		System.out.print("List(first-->last): ");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
