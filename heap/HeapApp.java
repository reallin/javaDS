package com.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapApp {

	public static void main(String[] args) throws IOException{
		int value,value2;
		boolean success;
		Heap theHeap = new Heap(31);
		theHeap.insert(70);
		theHeap.insert(40);
		theHeap.insert(50);
		theHeap.insert(20);
		theHeap.insert(60);
		theHeap.insert(100);
		theHeap.insert(80);
		theHeap.insert(30);
		theHeap.insert(10);
		theHeap.insert(90);
		theHeap.insert(110);
		while(true){
			System.out.println("Enter first letter of show,insert,remove,change:");
			char choice = getChar();
			switch(choice){
			case 's':
				theHeap.displayHeap();
				break;
			case 'i':
				System.out.println("Enter value to insert:");
				value = getInt();
				success = theHeap.insert(value);
				if(!success)
					System.out.println("Can't insert; heap full");
				break;
			case 'r':
				if(!theHeap.isEmpty())
					theHeap.remove();
				else
					System.out.println("Can't remove; heap empty");
				break;
			case 'c':
				System.out.println("Enter current index of item:");
				value = getInt();
				System.out.println("Enter new key:");
				value2 = getInt();
				success = theHeap.change(value, value2);
				if(!success)
					System.out.println("Invalid index");
				break;
			default:
				System.out.println("Invalid entry\n");
			}
		}
	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static char getChar() throws IOException{
		return getString().charAt(0);
	}
	
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}
