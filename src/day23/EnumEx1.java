package day23;

import java.util.*;

public class EnumEx1 {
//열거형 :: 어떠한 값들이 제한적일때. 691p. 서로 연관된 상수들을 편리하게 선언하기 위한 것.
	public static void main(String[] args) {
		
		// 문자열을 열거형으로 바꾸는 열거형.values(문자열)
		// 열거형에 있는 모든 값들 각각을 하나의 열거형으로 만들어서 배열을 생성
		
		Type t = null;
		//Type t = Type.교통비;
		//Type t2 =  Type.경조사비; //에러
		
		Scanner scan = new  Scanner(System.in);
		String type;
		Type[] arr = Type.values(); 
		do {
			int cnt = 1;
			System.out.println("분류  리스트");
			for (Type tmp : arr) {
				System.out.println(cnt++ + ". " + tmp);
				
			}
			System.out.println("분류를 입력 : ");
			type = scan.next();
			
			for (Type tmp : arr) {
				if (tmp.toString().equals(type)) {
					t = Type.valueOf(type);				
				}
			}
		}while(t == null);
		System.out.println(t);
		
	}

}

enum Type {
	통신비, 식비, 교통비, 월세, 주거비
}