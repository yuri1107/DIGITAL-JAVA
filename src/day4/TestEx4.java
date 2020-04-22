package day4;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고(중복 ㅇ)
		 * 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력하는 코드를 작성
		 *
		*/
		/* 내가하던거 다하지도못함 
		int arr[] = new int [10];
		int max = arr[0];
		int min = arr[0];
		int ful = 100;
		int low = 1;
		//임의의 수를 생성하여 배열에 저장 (중복 가능)
		
		for(int i=0; i<arr.length; i++) {
			int random = (int) (Math.random()*(ful-low+1)) + low;
			arr[i] = random;
			
			
		}

		//System.out.printf("%d 가 제일 큽니당.",arr[i]);
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		
		System.out.println();
		*/
		int arr[] = new int [10];
		int rMin = 1;
		int rMax = 100;
		int min,max;
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
		}
		for(int tmp:arr) {
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		
		min = max = arr[0]; //두 변수와 배열의0번지를 '배열의 0번지에 있는 값으로' 한번에 초기화하는것
		
		for(int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("배열의 최대값 : %d , 최소값 : %d \n", max, min);
		
	}

}
