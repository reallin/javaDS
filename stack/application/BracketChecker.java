package com.stack.application;
/**
 * 检查带{([这些括号的表达式中，括号是否是成对出现
 */
public class BracketChecker {
	private String input;
	public BracketChecker(String in){
		input=in;
	}
	
	public void check(){
		int stackSize=input.length();
		StackX stack=new StackX(stackSize);
		//可能出现的情况：1、{[(;	2、}]);	3、{])	4、{}])
		for(int j=0; j<stackSize;j++){
			char ch=input.charAt(j);
			//if(c=="{" || c=="["||c=="("} //此语句错误，应为'{'
			switch(ch){
			case '[':
			case '{':
			case '(':
				//压栈
				stack.push(ch);
				break;
			case ']':
			case '}':
			case ')':
				//弹栈
				if(!stack.isEmpty()){
					char chx=stack.pop();
					if((ch==']'&& chx!='[')||(ch=='}'&& chx!='{')||(ch==')'&& chx!='(')){
						System.out.println("Error: "+ch+"at: " +j);
					}
				}else{
					System.out.println("Error: "+ch+"at: " +j);
				}
				break;
			default:
				break;
			}
		}
		if(!stack.isEmpty()){
			//执行到此，如果有对应的符号，应该全部弹出，若不为空，说明左边符号没有相应的右边的符号
			System.out.println("Error: missing right bracket.");
		}
	}
}
