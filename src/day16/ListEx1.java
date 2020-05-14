package day16;

import java.util.*;
public class ListEx1 {

	public static void main(String[] args) {
		/* 1~10 사이의 랜덤한 수를 생성하여 리스트에 저장하고, 출력하는 코드를 작성하세요.
		 * 단, 중복불가
		*/
		/*
		List<Integer> list = new ArrayList<Integer>();
		
		while(list.size() < 6) {
			int r = new Random().nextInt(10)+1;
			if (!list.contains(r)) {
				list.add(r);
			}
		}
		System.out.println(list);
		*/
		
		rand();
		
	}

	public static void rand () { //중복없는 1~10사이 랜덤수 3개 출력
		List<Integer> list = new ArrayList<Integer>();
		
		while(list.size() < 3) {
			int r = new Random().nextInt(10)+1;
			if (!list.contains(r)) {
				list.add(r);
			}
		}
		System.out.println(list);
	}
	
	
}
