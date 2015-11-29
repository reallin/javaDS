package com.linklist.sorted;

public class SortedLinkList {
	private Link first;
	public SortedLinkList(){
		first = null;
	}
	
	public SortedLinkList(Link[] linkArr){
		first = null;
		for(int j=0;j<linkArr.length;j++){
			insert(linkArr[j]);
		}
	}
	
	public void insert(Link link){
		Link previous = null;
		Link current = first;
		while(current!=null && link.dData >current.dData){
			previous = current;
			current = current.next;
		}
		if(previous==null)//没找到后面的插入位置
			first = link;
		else
			previous.next = link;
		link.next = current;
		
	}
	
	public void insert(long key){
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current!=null && key>current.dData){
			previous = current;
			current = current.next;
		}
		if(previous==null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
	
	public Link remove(){
		Link temp = first;
		first = first.next;
		return temp;
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
