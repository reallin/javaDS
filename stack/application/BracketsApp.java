package com.stack.application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BracketsApp {
	public static void main(String[] args) throws IOException{
		String input;
		while(true){
			System.out.println("Enter a String containing delimiters:");
			System.out.flush();
			input=getString();
			if(input.equals("")) break;
			BracketChecker bc=new BracketChecker(input);
			bc.check();
		}
	}

	public static String getString() throws IOException{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String s=br.readLine();
		return s;
	}

	
}
