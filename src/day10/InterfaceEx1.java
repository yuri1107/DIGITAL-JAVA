package day10;
public class InterfaceEx1 {

	public static void main(String[] args) {
		
	}

}

//interface 클래스는 멤버변수가 없다. 그래서 매개변수로 알려줘야한다.
interface RemoteController {
	int num = 10; //interface 에 변수를 선언하게 되면 public final 이 생략되어 있어 '상수'로 선언하는것과 같다.
	public int chUp(int ch);
	public int chDown(int ch);
	
	public int volUp(int vol);
	public int volDown(int vol);
	/* 인터페이스에 새로운 추상메소드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러 발생.
	 * 이유는 오버라이딩을 하지 않았기 때문에.
	 * 이런 번거로움을 해결하고자 디폴트 메서드를 이용한다.
	 * 디폴트 메서드는 구현된 내용이 없는 메소드로, 추상메서드와의 차이는 
	 * 추상메서드는 구현클레스에서 꼭 오버라이딩을 해야하지만
	 * 디폴트메서드는 안해도 상관없다. (근데 실무에서 쓰는 경우는 드물다고 하심)
	*/
	default void test() {} //public 생략가능
}

class TvRemocon implements RemoteController{

	@Override
	public int chUp(int ch) { return ++ch; }

	@Override
	
	public int chDown(int ch) {	return --ch; }

	@Override
	public int volUp(int vol) {	return ++vol; }

	@Override
	public int volDown(int vol) { return --vol;	}
	
}