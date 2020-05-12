package day14;

public class WrapperEx1 {
//교재 492, 495
	public static void main(String[] args) {
		/*
		 *
		*/
		// int num = null; //원래 정수형에는 널값을 담을 수 없음.
		Integer num = null;
		
		boolean b1 = true;
		Boolean b2 = true;
		char ch1 = 'a'; //ch1 변수에 a를 저장
		Character ch2 = 'a'; //참조변수라서 주소가 와야하는데 이 경우에는 a라는게 저장되어있는 객체의 '주소'를 가져옴 ((이것이 오토박싱))
		ch1 = ch2; //원래는 말이 안되는건데 오토박싱과 언박싱에 의해 값을 전달하는 역할을 해서 말이 되게 됨 ((이것이 언박싱))
		//쌤 주석 :: a가 저장된 주소를 ch2에 전달
		int num1 = 10;
		Integer num2 = 10;
		double dnum1 = 1.23;
		Double dnum2 = 1.23;
		Double dnum3 = new Double(1.23); // 클래스이기 때문에 생성자를 통해서 만들 수도 있음(하지만 보통은 윗줄들처럼 사용함)
		// wrapperClass를 사용하려면 자료형의 첫글자를 대문자로 선언하면 된다. (위의 변수2들이 모두 래퍼클래스)
		// 설명에 (deprecated)라고 있으면서 취소선이 생기면 예전버전에서는 지원했지만 최신버전에서는 필요없어서 지원안한다는뜻

	}

}
