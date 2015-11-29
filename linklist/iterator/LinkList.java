package com.linklist.iterator;

public class LinkList {
	private Link first;
	public LinkList(){
		first = null;
	}
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link first) {
		this.first = first;
	}
	
	public boolean isEmpty(){
		return first==null;
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
	
	public ListIterator getIterator(){
		return new ListIterator(this);
	}
	
	class ListIterator{
		private Link current;
		private Link previous;
		private LinkList ourList;
		public ListIterator(LinkList list){
			ourList = list;
			reset();
		}
		
		public void reset(){
			current = ourList.getFirst();
			previous = null;
		}
		
		public boolean atEnd(){
			return current.next==null;
		}
		
		public void nextLink(){
			previous = current;
			current = current.next;
		}
		
		public Link getCurrent(){
			return current;
		}
		
		//在迭代器正在访问的节点之后插入一个新节点
		public void insertAfter(long dd){
			Link newLink = new Link(dd);
			if(ourList.isEmpty()){
				ourList.setFirst(newLink);
			}else{
				newLink.next = current.next;
				current.next = newLink;
				nextLink();
			}
		}
		
		//在迭代器正在访问的节点之前插入一个新节点
		public void insertBefore(long dd){
			Link newLink = new Link(dd);
			if(previous == null){
				newLink.next = ourList.getFirst();
				ourList.setFirst(newLink);
				reset();
			}else{
				newLink.next = previous.next;
				previous.next = newLink;
				current = newLink;
			}
		}
		
		public long deleteCurrent(){
			long val = current.dData;
			if(previous==null){
				ourList.setFirst(current.next);
				reset();
			}else{
				previous.next = current.next;
				if(atEnd())
					reset();
				else
					current = current.next;
			}
			return val;
		}
	}
}
