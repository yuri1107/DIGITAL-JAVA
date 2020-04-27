package day7;

public class MethodEx6 {

	public static void main(String[] args) {
		/*
		 *
		*/
		/* 혼자 한거
		int max = 5, min = 1; //랜덤값 범위
		int r = random10(nb);
		*/
		int min = 5, max = 10; //랜덤값 범위
		
		int r = random(min,max); //변수에 메서드를 넣음
		
		System.out.println(r);

	}
	
	/* 기능 : 임의의 정수를 생성하여 알려주는 메서드.
	 * 매개변수 : int 범위값중 최소값과 최대값 => int min, int max
	 * 리턴타입 : int 임의의 정수 => int
	 * 메서드명 : random
	 * */
	
	//혼자해본거 응 안됨
	/*
	public static int random10 (int nb) {
		int nb = (int)(Math.random()*(max-min+1)+min);
		System.out.println(nb);	
		return nb;
		
	}
	*/
	public static int random (int min,int max) {
		if (min > max) { // 만약 최소값 최대값 순서가 바뀌였을 경우
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}

}
