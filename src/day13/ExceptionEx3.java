package day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
		//System.out.println(calc(1,'%',0)); //이렇게 밖에 있으면 예외가 발생하더라도 강제종료되고 예외'처리'를 하지 않음
		try {
			System.out.println(calc(1,'%',0)); //이렇게 try 안에 있어야 예외'처리'를 해서 프로그램은 정상적으로 실행됨.
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// 보통 프로그래밍을 할때 메서드에서는 예외를 발생만 시키고 처리는 메인에서 한다. 따라서 이번 예제도 발생은 메서드에서 하지만 처리는 메인에서 한다.
	// calc 메서드는 예외처리를 하지 않고 예외를 발생만 시킨다.
	// 예외처리는 main메서드에서 할 것.
	// 발생한 예외가 RuntimeException이면 메소드 옆에 발생 가능한 예외를 생략해도 되지만
	// RuntimeException이 아닌 경우는 메소드 옆에 발생 가능한 예외를 기술해줘야한다.
	public static double calc(int num1, char op, int num2) throws Exception { //default에서 Exception 가 발생할 수 있다는 의미. 
		// ,로 구분하며 ArithmeticException 도 함께 기술할 수 있음.
		double res = 0.0;
		switch (op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : 
			if (num2 == 0) throw new ArithmeticException ("0으로 나눌 수 없습니다."); 	
			res = (double)num1 / num2; 
			break;
		case '%' : 
			if (num2 == 0) throw new ArithmeticException ("0으로 나눌 수 없습니다."); 	
			res = num1 % num2; 
			break;
		default : throw new Exception (op + " 는 산술연산자가 아닙니다."); 		
		}
		return res;
		
		
	}

}
