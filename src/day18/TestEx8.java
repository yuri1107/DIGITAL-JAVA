package day18;

import java.util.*;
//전시간에 잤음 시발;;
public class TestEx8 {

	public static void main(String[] args) {
		/* 정수 n개를 입력받아 저장하고 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예) 
		 * 입력받을 정수의 갯수 : 5 
		 * 정수 5개를 입력하세요 : 12 13 15 18 16
		 * 입력받은 정수를 거꾸로 출력 : 16 18 15 13 12
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("입력받을갯수 : ");
		
		int size = scan.nextInt();
		Stack<Integer> arr = new Stack<Integer>();
		//먼저 들어간게 나중에 나오는 특성을 갖고 있는 스택이기 때문에 이 예제에서 사용가능
		System.out.print("정수 " + size + "개를 입력하세요 : ");
		for (int i = 0; i < size; i++) {
			arr.push(scan.nextInt());
		}
		
		System.out.print("입력받은 정수를 거꾸로 출력 : ");

		Stack<Integer> tmp = new Stack<Integer>();
		tmp.addAll(arr);
		for (int i = size-1; i >=0; i--) {
			System.out.print(arr.pop() + " ");
		}
		scan.close();
	}
	

}
