package day6;

public class MethodEx3 {

	public static void main(String[] args) {
		/* 매개변수가 일반 변수 이면 매개변수의 원본값이 변경되지 않는다.
		 * 모든 매개변수들은 '값'을 가지고 있는다. 참조변수가 됐든 일반변수가 됐든. 
		 * 그리고 매개변수는 값을 '복사'해서 갖고온다 (?)
		*/
		int num1 = 10, num2 = 20;
		System.out.printf("num1=%d, num2=%d (main)\n", num1, num2);

		swap(num1,num2);

		System.out.printf("num1=%d, num2=%d (main)\n", num1, num2);
		
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.print(tmp + " "); //배열의 값을 한줄에 출력하기 위함.
		}
		System.out.println("--------------------");
		
		//매개변수가 참조변수이면 매개변수의 원본값을 바꿀 수 있다. (일반변수와의 차이점)
		//왜냐하면 같은 애의 주소를 가져오는것이기 때문이다. 
		setArray(arr, 77);
		
		for(int tmp : arr) { // 배열의 값을 모두 출력하기 위한 반복문
			System.out.print(tmp + " "); //배열의 값을 한줄에 출력하기 위함.
		}

	} // main(String[] args) 닫기 
	public static void swap(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.printf("num1=%d, num2=%d (swap) \n", num1, num2);
	}
	
	/* 기능 : 배열의 모든 값을 num으로 변경하는 메서드
	 * */
	public static void setArray(int []arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
		}
	}
	
	
	
	
	

} //MethodEx3 class
