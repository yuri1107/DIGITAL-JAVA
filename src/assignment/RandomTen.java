package assignment;

import java.util.*;

public class RandomTen {
	/* 1~10 사이의 랜덤한 수를 6개 생성하여 리스트에 저장하고, 출력하는 코드를 작성하세요.
	단, 중복불가
	1. 리스트 생성 
	2. 반복문 실행 => 종료조건 설정
		2-1. 1~10 사이의 랜덤한 수 생성
		2-2. 리스트에 생성된 랜덤수가 있는지 체크
			2-2-1. 없으면 리스트에 추가
	3. 리스트 출력
*/
	public static void main(String[] args) {
		
		
		ArrayList randlist = new ArrayList(6);
		
		rand(randlist);
		
	} //main close
	
	public static void rand(ArrayList randlist) {
		//(int)(Math.random()*(max - min +1 ) + min)
		int max = 10, min = 1;
		int ranNum = (int)(Math.random()*(max - min +1 ) + min);
		int recnt = 6; //반복 횟수
		System.out.println(ranNum);
		
		for (int i = 1; i <= randlist.size(); i++) {
			//인티저인가 이퀄스인가 써서 중복확인하고 그 다음에 리스트 추가
			
			if (!randlist.equals(ranNum)) {
				randlist.add(new Integer(ranNum));
			}
		}
		
	}
} //class close