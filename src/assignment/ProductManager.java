package assignment;

import java.util.Scanner;

public class ProductManager {

	public static void main(String[] args) {
		/*상품을 등록하고, 등록된 상품을 출력하는 코드를 작성하세요.
			예)
			상품을 등록하겠습니까?(y/n) : y
			상품명 : 가방
			가격 : 10000
			상품을 등록하겠습니까?(y/n) : y
			상품명 : 마우스
			가격 : 1000
			상품을 등록하겠습니까?(y/n) : n
			지금까지 등록된 상품 리스트
			1. 상품명 : 가방, 가격 : 10000원
			2. 상품명 : 마우스, 가격 : 1000원
		*/
		/* 상품등록 메서드
		 * 등록상품 출력메서드
		 * 상품 배열 (상품명과 가격)
		 * 스캔 - 상품명과 가격 입력받기
		 * 반복문 - 상품등록 ,  n이면 등록 ㄴ 종료, 리스트출력 (리턴ㅇ 상품리스트)
		 * */
		Scanner scan = new Scanner(System.in);
		int question = 0; //아직쓸모없음 걍 만들어논거
		int cnt = 0; // 저장된 갯수
		int quantity = 10; //상품명이랑 가격 갯수 맞추는 변수. 이거 바꾸면 저장할 수 있는 상품 길이도 달라짐
		String[] product = new String [quantity]; //상품명
		int[] price = new int [quantity]; //가격
		//char answer;
		
		
		//System.out.println("상품을 등록하겠습니까?(Y/N) : ");
		//char answer = scan.next().charAt(0);
		// 위 두 줄을 없애고 아래 if문의 조건식을 바꿔야함 
		//if (answer == 'Y' || answer == 'y') {enrollment(answer, product, price, cnt, scan);}
		enrollment(product, price, cnt, scan);

	}//main메서드 닫히는 괄호

	public static char enrollment (String[] product, int[] price, int cnt, Scanner scan) {

		System.out.println("상품을 등록하겠습니까?(Y/N) : ");
		char answer = scan.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y') {
			//상품 등록하는 실행문반복문 
			for (int i = 0; i < product.length; i++) {
				System.out.print("상품명 : ");
				product[i] = scan.next();
				System.out.print("가격 : ");
				price[i] = scan.nextInt();
				cnt++;
				//if (answer != 'Y' || answer != 'y') {break;}
				
			}
		}
		else if (answer != 'Y' || answer != 'y') {
			//상품리스트 출력하는 실행문 productList
			for (int i = 0; i < cnt; i++) {
				System.out.printf("%d. 상품명 : %s, 가격 : %d원", i, product[i], price[i]);
			}
		}
		return answer;
	}
}
