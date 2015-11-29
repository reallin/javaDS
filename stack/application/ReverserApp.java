package com.stack.application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverserApp {
	public static void main(String[] args) throws IOException {
		String input,output;
		while(true){
			System.out.println("Enter a String:");
			System.out.flush();
			input=getString();
			if(input.equals("")) break;
			Reverser rv=new Reverser(input);
			output=rv.doRev();
			System.out.println("Reverser: "+output);
			//StringBuilder的反转方法
			StringBuilder sb=new StringBuilder("中华人民共和国");
			System.out.println("StringBuilder Reverse: "+sb.reverse());
		}
	}
	public static String getString() throws IOException{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String s=br.readLine();
		return s;
	}
}
