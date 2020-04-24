package day6;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 0번지에는 0을 1번지에는 1을 넣도록 하세요.
		 * 그리고 배열의 값을 출력하여 제대로 들어갔는지 확인하세요.
		 *
		*/
		/*
		int[] arr = new int [5];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i;
			System.out.print(arr + " ");
		}
		
//		System.out.print(arr + " ");
		*/
		
		/*
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		*/
		
		//쌤이랑 한거
		/*
		 int[] arr = new int [5]; // int arr[] = new int [5];
		 
		 //배열의 값을 0번지부터 마지막까지 접근하는 반복문
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
		 System.out.println();
		 */
		
		int[] arr = new int [5]; //배열을 생성하고 선언하는 부분.
		
		printArray(arr); //메소드명(매개변수); = 메소드 호출
		
		//메인에서 호출된 메소드명을 만나면 해당 메소드명으로 찾아가서 메소드를 수행 후 메인의 나머지 일들을 해결한다.
		
		//System.out.println(arr); //이렇게하면 arr의 물리적 주소가 출력됨
		
		// 0번지에 0을 ~ 4번지에 4를 저장되도록 작성하세요
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = j;
		}
		
		printArray(arr); //바로 위에 있는 for문을 실행 하고 나서 메서드를 호출. (배열은 참조변수이기 때문에 값이 달라졌음을 확인할 수 있다.)
		

		int num = 4;	
		
		if(isDuplicated(arr,num)) {
			System.out.println(num + " 는 있습니다.");
		}else {System.out.println(num + "는 없습니다.");}
		
		
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 확인하여 있으면 있습니다. 없으면 없습니다. 라고 출력하는 코드를 작성하세요.
		 * 
		 * */
		
		//혼자했던건데 이상하게출력댐
		/*
		int num = 1;
		
		for(int j = 0; j < arr.length; j++) {
			if (num == arr[j]) {
				System.out.println("있습니다"); break;
			}else{System.out.println("없습니다"); break; }
			
		}
		
		int num = 4;	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(num + "은 있습니다." + arr[i] + "번지에 있습니다.");
				break;
			}
			if (i == arr.length-1) {
				System.out.println(num + "은 없습니다.");
			}
			
		}	
		
		printArray(arr);
		*/
		
		

		

		
	}
	
	/* 기능 : 배열이 주어지면    주어진 배열의 각 요소의 값들을 출력    하는 메서드
	 * 매개변수 : int[] arr1  배열
	 * 리턴타입 : int[]      없다
	 * 메서드명 : printArray
	 * */
	/* 혼자 해보던거 왜 안되는지 고민해보깅
	public static void printArray (int[] arr1) { //void는 리턴값이 없음을 말함.
		
		//배열 생성 및 선언은 해당 메소드가 아닌 다른 구간에서 해야함
		
		
		for(int i = 0; i < arr1.length; i++) {
			 System.out.print(arr1[i] + " ");
		}		
		
		return arr1;
	}
	*/
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	/* 기능 : 배열 arr에 num의 값이 있는지 없는지 확인하는 메서드
	 * 매개변수 : int[] arr 	 쌤 : 배열, 정수
	 * 리턴타입 : 0 1			 쌤 : boolean
	 * 메서드명 : isDuplicated
	 * */
	
	/* 혼자 해본 배열에 넘값 있고없고 확인 */
	public static boolean isDuplicated(int[] arr,int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {return true;}
			if (i == arr.length-1) {return false;}
		}
		return false; // 배열의 길이가 0이면 for문을 실행하지 않기 때문에 for문을 실행하지 않더라도 반환시킬 값이 필요하다.
		// 이 경우에는 '배열 arr에 num의 값이 있다면 true를 반환하는데 for문을 실행하지 않는다면 무조건 거짓이 되기 때문에 거짓을 반환한다.
	}


}
