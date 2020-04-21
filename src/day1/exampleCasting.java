package day1;

public class exampleCasting {

	public static void main(String[] args) {
		//정수형 변수 num에 실수 1.23을 저장하면 0.23이 사라지기 때문에 에러발생.
		//해결하기 위해 명시적 자료형변환을 이용해 1.23을 1로 바꿔 저장.
		
		int num = (int)1.23;
		//실수형 변수 dnum에 정수 1을 저장하면 자동자료형변환으로 인해 1.00으로 저장됨.
		
		double dnum = 1;
		float fnum = 1.23f;
		
		// float fnum = (float)1.23; 과 같음.
		
		/*자동 자료형 변환이 되는경우
		 * 정수 -> 실수
		 * 바이트가 작은것 -> 큰것
		 * float -> double
		 * byte > short(char) > int > long
		 * 
		 * 위에 해당하지 않는경우에는 형변환을 해줘야함.
		 */

		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);

	}

}