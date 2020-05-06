package day7;

public class TestEx1 {

	public static void main(String[] args) {
		/*
		 *
		*/
		
		int size = 3;
		int[] com = new int [size];
		int min = 1, max = 9;
		createArray(min, max, size, com);
		printArray(com);
		
		//반복시작 (3스트라이크가 나올때까지)
		//사용자가 세 수를 입력
		
		
		//스트라이크 판별
		
		
		//볼을 판별
		
		
		//3아웃 판별
		//반복 끝
		
		
		

	}
	/* 기능 : min에서 max사이의 중복되지 않는 n개의 배열값을 생성하여 저장하는 메서드
	 * 중복확인,랜덤,생성,저장
	 * 매개변수 : min max n개, 배열 => int min,int max, int n, int[] arr
	 * 리턴타입 : 예외처리를 위해 1이면 배열생성
	 * 					0이면 배열생성 실패 (범위가 좁으면 중복으로 인해 배열생성에 실패할 수 있음) => int로 해야하는데 boolean 으로 할것임 ㅋ
	 * 메서드명 : createArray
	 * 예를 들면 min = 1, max = 3이고 , n = 4인 경우 min~max사이의 중복되지 않는 랜덤한 수는 총 3개인데 4개를 만들어야하니 1개를 만들수가 없어서 무한루프에 빠진다.
	 * if문 해서  max - min + 1 >= n 이면 배열생성 가능, 아니면 배열 생성 실패 
	 * 
	 * */
	
	
	
	public static boolean createArray(int min, int max, int n, int[] arr) {
		if(arr == null) { // new를 통해 배열을 생성하지 않은 경우 (배열을 선언만 하고 없는 경우)
			return false;
		}if (max - min + 1 < n) { //배열을 못만드는 경우
			return false;
		}
		int cnt = 0; //현재 배열에 저장된 원소의 갯수
		while (cnt < n ) {
			int r = random(min,max);
			if(!isDuplicated(arr,r)) {
				arr[cnt++] = r;
			}
		}
		return true;
	}
	
	
	//랜덤 만들기
	public static int random (int min,int max) {
		if (min > max) { // 만약 최소값 최대값 순서가 바뀌였을 경우
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min); //이건 공식 그냥 외우기
	}
	
	//배열 출력하기
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//배열 안에 중복값 확인
	public static boolean isDuplicated(int[] arr,int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {return true;}
			if (i == arr.length-1) {return false;}
		}
		return false; // 배열의 길이가 0이면 for문을 실행하지 않기 때문에 for문을 실행하지 않더라도 반환시킬 값이 필요하다.
		// 이 경우에는 '배열 arr에 num의 값이 있다면 true를 반환하는데 for문을 실행하지 않는다면 무조건 거짓이 되기 때문에 거짓을 반환한다.
	}	
	
	
}//class닫기
