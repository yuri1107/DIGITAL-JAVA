package day3;



public class ArrayEx2 {

	public static void main(String[] args) {
		// 변수 복사하는것 예시
		/*
		int num1 = 10;
		int num2 = 20;
		num1 = num2;		
		System.out.println(num1);
		*/
		int arr1[] = new int [] {1,2,3,4};
		int arr2[] = new int [] {9,8,7,6};
		//arr2[0] = 1;
		/*
		쌤 말씀 "arr2가 만든 배열을 arr1과 arr2가 공유하게 됨. arr1에 있던 배열이 사라짐.
		arr1 = arr2;  일반 변수는 이렇게 복사가 가능하지만 배열은 안됨. 
		배열은 참조변수이기 때문에 '주소'가 복사되어 같은곳을 '공유'하는것이기 때문.
		*/
		
		//아래 for문의 조건식은 배열 쓸때 기본이 되는 틀이니 그냥 외우는게 좋음
		
		for(int i=0; i<arr1.length; i++) {
			// 배열 복사하기 : arr1[i] = arr2[i]; 
			//복사하는거라서 tmp가 필요없음. 두 배열을 교환한다면 tmp 변수가 필요함.
			int tmp = arr1[i]; //배열 a,b 서로 맞교환
			arr1[i] = arr2[i]; //배열 a,b 서로 맞교환
			arr2[i] = tmp;		//배열 a,b 서로 맞교환
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		System.arraycopy(arr1, 1, arr2, 0, arr1.length-1);
		//arr1의 인덱스 1 (0,1,2,3) 부터 를 arr2의 인덱스 0 부터 복사하겠다. arr1의 길이에서 -1한 만큼의 갯수를.
		//arr1의 내용물을 arr2의 내용에 덮어쓰는거라서 arr2의 내용물만 바뀌는것
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}		
		System.out.println();
	
		
				
	}

}
