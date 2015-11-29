package com.linklist.iterator;

import com.linklist.iterator.LinkList.ListIterator;

public class InterIteratorApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();
		long value;
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(80);
		iter1.insertBefore(60);
		
	}
}
