package com.linklist.firstlast;

public class FirstLastLinkListApp {

	public static void main(String[] args) {
		FirstLastLinkList theList = new FirstLastLinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		theList.displayLinkList();
		theList.deleteFirst();
		theList.deleteFirst();
		theList.displayLinkList();
	}
}
