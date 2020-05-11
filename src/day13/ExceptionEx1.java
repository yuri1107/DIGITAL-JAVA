package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/* 5 ~ 9 -> 11 -> 15 -> 19
		 *
		*/
		try {
			//예외가 발생할 수 있는 코드
			//System.out.println(1/0);
			int arr[] = new int[4];
			//에러가 발생하면 그 이후 코드는 실행되지 않고 catch로 건너뛴다.
			arr[3] = 10;
			System.out.println("Hello");
			arr[4] = 12;
			System.out.println("배열에러가 뜨기때문에 catch로 건너뛰기때문에 이건 실행되지 않음");
		}catch(ClassCastException e) {
			//예외처리
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // e에다가 왜 에러가 발생했는지 담아서 프린트함
		}catch(IndexOutOfBoundsException e) {
			//예외처리
			System.out.println("배열관련 예외가 발생");
			//e.printStackTrace();
		}
		catch(Exception e) { //모든 예외의 부모인 Exception 이 가장 마지막 캐치에 있어야 한다. 모두 해결 가능하기때문에 다른 캐치가 실행되지 않기때문. 
			//예외처리
			System.out.println("예외 발생");
			//e.printStackTrace();
		}
		/* 에러발생. 위에 Exception 이 모든 예외를 처리하기때문에 해당 예외 클래스까지 오는 경우가 절대 없어서.
		catch(ArithmeticException e) { // 객체지향도 순서대로 하기때문에 Exception 의 밑에 캐치를 넣으면 Unreachable catch block (절대 실행될수 없다) 에러 발생
			System.out.println("수학적인 오류 발생");
		}*/
		

	}

}
