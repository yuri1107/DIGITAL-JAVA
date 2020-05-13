package day15;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(new Integer(2));
		stack.push(Integer.parseInt("3"));
		System.out.println(stack.pop()+"을 스택에서 꺼냈습니다."); //stack.pop(); // 3 지움
		System.out.println(stack.pop()+"을 스택에서 꺼냈습니다."); //stack.pop(); // 2 지움
		
		
		//pop는 마지막 요소를 꺼낸다 => 마지막 요소를 반환한다.
		
		for (Integer tmp : stack) {
			System.out.println(tmp);
		}
		
		
	}

}
