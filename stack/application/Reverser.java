package com.stack.application;
/**
 * µ¥´ÊÄæĞò´òÓ¡
 * 
 **/
public class Reverser {
	private String input;
	private String output;
	public Reverser(String in){
		input=in;
	}
	public String doRev(){
		int stackSize=input.length();
		StackX theStack=new StackX(stackSize);
		for(int j=0;j<stackSize;j++){
			theStack.push(input.charAt(j));
		}
		
//		StringBuilder sb=new StringBuilder();
//		for(int j=0;j<stackSize;j++){
//			sb.append(theStack.pop());
//		}
//		return sb.toString();
		
		output="";
		while(!theStack.isEmpty()){
			char c=theStack.pop();
			output=output+c;
		}
		return output;
	}
}
