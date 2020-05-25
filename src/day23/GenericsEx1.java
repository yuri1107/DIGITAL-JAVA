package day23;

import java.util.*;
//670p. 지네릭스 : 클래스(A) 내의 멤버변수의 클래스(B) 를 미리 지정해놓지 않고, 
//				클래스(A) 를 생성할 때 결정해주는 것. 
public class GenericsEx1 {

	public static void main(String[] args) {
		Student<Integer> s = new Student<Integer>();
		s.kor = 10;
		System.out.println(s.kor);
	}

}
class Student<A> {
	String name;
	A kor;
	A eng;
	A math;
	
	
}