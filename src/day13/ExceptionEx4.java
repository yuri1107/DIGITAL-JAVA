package day13;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			// throw new MyException(100,"예외상황 입니다."); //throw  옆에는 항상 객체가 와야함. 여기 와있는건 클래스객체(익명객체) 
			//throws는 메서드 매개변수 다음에 옴. (예외가발생할수있다는뜻에서)
			MyException e = new MyException(100, "예외상황입니다.");
			throw e;
		}catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Exception 입니다.");
			e.printStackTrace();
		}
	}

}
/* 이름에 예외가 들어간 MyException이라는 클래스를 만드는것이 아니라
 * 예외처리에서 사용할 수 있는 MyException 클래스를 생성. (교재 415p (계층도) 참고 )
*
*/


class MyException extends Exception{
	private final int ERR_CODE;
	public MyException(int err_code, String msg) { //생성자
		super(msg);
		ERR_CODE = err_code;
	}
	public MyException() {
		ERR_CODE = -1;
	}
	public MyException(int err_code) {
		ERR_CODE = err_code;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	
	
	public int getERR_CODE() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		
		return "ERR_CODE : " + ERR_CODE + ", MSG : " +super.getMessage();
	}
}