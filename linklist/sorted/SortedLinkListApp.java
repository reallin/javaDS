package com.linklist.sorted;

public class SortedLinkListApp {

	public static void main(String[] args) {
		SortedLinkList theList = new SortedLinkList();
		theList.insert(20);
		theList.insert(40);
		theList.displayLinkList();
		theList.insert(10);
		theList.insert(50);
		theList.insert(30);
		theList.displayLinkList();
		theList.remove();
		theList.displayLinkList();
		System.out.println("*************************************************");
		int size = 10;
		Link[] linkArr = new Link[size];
		for(int j=0;j<size;j++){
			int n=(int)(java.lang.Math.random()*99);
			Link newLink = new Link(n);
			linkArr[j] = newLink;
		}
		System.out.print("Unsorted array: ");
		for(int j=0;j<size;j++)
			System.out.print(linkArr[j].dData+" ");
		System.out.println();
		SortedLinkList theSortList=new SortedLinkList(linkArr);
		theSortList.displayLinkList();
		System.out.print("Sorted array: ");
		for(int j=0; j<size;j++)
			linkArr[j]=theSortList.remove();
		for(int j=0; j<size;j++)
			System.out.print(linkArr[j].dData+" ");
		System.out.println();
	}
}
