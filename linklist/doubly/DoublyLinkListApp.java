package com.linklist.doubly;

public class DoublyLinkListApp {

	public static void main(String[] args) {
		DoublyLinkList theList = new DoublyLinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		theList.displayForward();
		theList.displayBackward();
		theList.deleteFirst();
		theList.displayForward();
		theList.deleteLast();
		theList.displayForward();
		theList.insertAfter(44, 88);
		theList.displayForward();
		theList.deleteKey(88);
		theList.displayForward();
	}
}
