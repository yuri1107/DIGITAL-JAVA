package day10;

public class InnerClassEx1 {

	public static void main(String[] args) {
		C1 c = new C1();
		A1 a = new A1();
	//	test(a); // 구현하지 않았기때문에 문법적으로 오류
		test(c); // b를 구현했기때문에 문법적으로 허용
		
		/* 인터페이스 B1을 구현한 클래스를 아래에서 바로 만든 후 만들어진 클래스의 객체를 매개변수로 전달하여 test메서드를 실행.
		 * 이 과정과 같은 내용이 위에 있는 클래스 C를 이용한 방법이다. 
		*/
		
		//1. 클래스를 만들고 2. 클래스를 이용해 객체를 만들고 3.객체를 이용해 매개변수를 전달  까지 하는 코드
		test(new B1() {
			public void func () {} //이 부분이 class
		}); 
		
	}
	public static void test(B1 b) {
		System.out.println("야호");
	}

}

class A1 { 	}

interface B1 {	public void func(); }

class C1 implements B1 {
	@Override
	public void func() {}
	
}