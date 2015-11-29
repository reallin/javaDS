package com.linklist.adt;

public class LinkListADTApp {

	public static void main(String[] args) {
		LinkListStack theStack = new LinkListStack();
		theStack.push(20);
		theStack.push(40);
		theStack.displayStack();
		theStack.push(60);
		theStack.push(80);
		theStack.displayStack();
		theStack.pop();
		theStack.pop();
		theStack.displayStack();
		System.out.println("*************************************************");
		FirstLastLinkListQueue theQueue = new FirstLastLinkListQueue();
		theQueue.insert(11);
		theQueue.insert(22);
		theQueue.displayQueue();
		theQueue.insert(33);
		theQueue.insert(55);
		theQueue.insert(44);
		theQueue.displayQueue();
		theQueue.remove();
		theQueue.remove();
		theQueue.displayQueue();
	}
}
