package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		/*배열의 내용을 정렬하는 예제
		 *
		*/
		int arr[] = new int [10];
		int rMin = 1;
		int rMax = 100;
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
		}
		for(int tmp:arr) {
			System.out.printf("%3d ", tmp);
		}
		System.out.println();
		
		//이중반복문으로 배열에서 가장작은수 ~ 가장 큰 수 순으로 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) { //10개의 배열요소들을 왼쪽과 오른쪽꺼를 비교하는 조건식 -i를 한건 확정된 애를 제외하고 비교하기
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int tmp:arr) {
			System.out.printf("%3d ", tmp);
		}
		System.out.println();

		
		
		
	}

}
