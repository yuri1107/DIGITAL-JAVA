package day10;

public class AbstractEx1 {
	public static void main(String[] args) {
		/*
		 *
		*/

	}

}

//class A 는 추상클래스이다. 왜냐하면 추상메서드 test()를 가지고 있기 때문이다.
abstract class A {
	int a;
	public void print() { System.out.println(a); }
	public abstract void test();
}

//추상클래스를 상속받으면 반드시 오버라이딩을 통해 추상메서드를 재정의 해야한다.
class B extends A {
	@Override
	public void test() {
		
	}
}
