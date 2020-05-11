package assignment;

import java.util.Scanner;

public class MaleOrFemale {

	public static void main(String[] args) {
		/* 주민등록번호를 입력하여 남자인지 여자인지 판별하세요.
		 * 내가 추가로 원하는것 : 입력받은 주민번호가 하이픈으로 구분되어 있으면 하이픈을 제거하고 인덱스번호를 받아서 그 번호로 남녀 구분
		 * 번호로 남녀구분 하는건 나머지가 1이냐 0이냐
		 * 1남/2여/3남/4여/5남/6녀/7남/8녀
		 * 961107  2 0  1 7   1  3  2
		 * 1234567 8 9 10 11 12 13 14
		*/
		Scanner scan = new Scanner(System.in);
		String security;
		int female = 0 ;
		
		for ( ; ; ) {
			System.out.println("주민번호를 입력하세요 :  종료를 원할경우 '종료' 입력 : ");
			security = scan.nextLine();
			if (security.contains("-")) {
				
				security.replaceAll("-", "");
				female = security.charAt(7);
				if (female % 2 == 0) {
					System.out.println("해당 주민번호는 여성입니다.");
				}else {System.out.println("해당 주민번호는 남성입니다.");}
			}
			
		}

	}

}
