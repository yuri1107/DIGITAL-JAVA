package day4;

public class TestEx3 {
	public static void main(String[] args) {
		/*
		 * 1. 정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요.
		 * 2. 1부터 10까지 차례대로 배열에 저장하세요. 직접 넣어주거나 아님 반복문으로 하나씩 넣어주거나
		 * 3. 저장된 배열의 값을 출력하세요.
		 * 4. 인덱스가 짝수면 현재 저장된 수에 2를 곱해서 저장하세요.
		 * 5. 저장된 배열의 값을 다시 출력하세요.
		 */
		
		//혼자서못했음시팔 2번부터막힘
		//int[] ten = new int [] {1,2,3,4,5,6,7,8,9,10}
		
		int arr[] = new int[10];
		
		//for(i는 0번지 부터 9번지까지 1씩 증가) 즉 배열길이인 arr.length 말고 10 이라고 써도 됨.(인덱스를 10개로 생성했으니까)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; //이부분을 존나 몰라서 삽질했는데 ... 이게 2번이라니..
		}
		//0번지부터 9번지까지 배열의 값을 출력
		//System.out.println(arr[0]); 이라고 노동도 가능
		//for (i는 0번지부터 9번지까지 1씩 증가
		//i번지의 값을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%2d ",arr[i]);
		}
		// 3번 완료
		System.out.println();
		
		for (int i=0; i<arr.length; i+=2) {
			arr[i] = arr[i]*2;
			//arr[i] *= 2; 라고도 쓸 수 있음
		}
		//4번도 어렵구먼..

		
		
		
		for (int tmp : arr) {
			//System.out.print(tmp + " ");
			System.out.printf("%2d ",tmp);
		}
		// 5번 완료
		System.out.println();		
		
		
		
	}
}
