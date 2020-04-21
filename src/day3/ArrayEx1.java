package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 
		/* 5개의 정보를 입력받아 저장하려할때 배열이 없으면 아래와 같이 
		 * 1. 5개의 변수를 선언하고
		 * 2. Scanner를 통해 5번 직접 입력받는 
		 * 코드를 작성해야한다.
		 */
		//하지만 배열을 이용하면 효율적으로 입력받아 저장하는 코드를 만들 수 있다.
		Scanner scan = new Scanner(System.in);
		/*
		int n1, n2, n3, n4, n5;

		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		n4 = scan.nextInt();
		n5 = scan.nextInt();

		*/
		int [] arr1,arr2; //arr1 과 arr2 는 둘 다 배열.
		int arr3[],arr4; //arr3은 배열, arr4는 일반 변수
		arr1 = new int [5]; //5는 배열 갯수. 즉 5개짜리 배열 arr1을 만든것. (배열 생성)
		int []arr5 = new int[5]; //배열 선언과 동시에 생성
//		arr1 [0] = 1;
//		arr1 [2] = 3;
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt(); // arr1 [i] 를 덮어쓰기
		}
		//System.out.println(arr1[0]);
		//아래 for문에서 i<=arr1.length 라고 쓰면 5번 인덱스까지 사용하겠다는 것이라서 에러가 난다.
		//5개짜리 배열을 만들었지만 0부터 시작하기때문에 인덱스는 4까지밖에 없다.
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//32번째 줄, 36번째줄에서 int i를 두번 선언했지만 for문 안에서만 쓰이는 변수이기 때문에 선언했던 for문 밖에서는 영향 ㄴㄴ
				
		scan.close();		

	}

}
