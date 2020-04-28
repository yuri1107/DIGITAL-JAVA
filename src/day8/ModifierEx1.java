package day8;

public class ModifierEx1 {

	public static void main(String[] args) {
		//final 변수는 상수이다. 이름붙은 상수. 보통 선언과 동시에 초기화
		//변수명을 지을때 상수는 대문자로 작성합니다.
		final int MAX = 10;
		// public static final double PI
		System.out.println(Math.PI);
		D d = new D();
		Object o1 = new Object();
		d.print1(o1);
		/*
		A a = new A();
		d.print1(a);
		*/
		d.print1(new A());
		//new를 통해 만들어졌지만 바로 매개변수로 들어가서 이름이 없는 객체를 잉여객체 라고 함
	}

}
//final 클래스는 부모가 될 수 없다
final class A  {
	public int a;
}
class B {
	//final 메서드는 오버라이딩 할 수 없다
	public final void print() {
		System.out.println("class B");
	}
}
class C extends B {
	//public void print() {} //final 메서드는 오버라이딩 할 수 없다
	public final int num;
	public C() {
		num = 0;
	}
	public C(int num) {
		//final멤버변수는 선언과 동시에 초기화 하지 않아도 초기화를 생성자에서 할 수 있다.
		this.num = num;
	}
}
class D {
	//매개변수로 클래스 Object의 객체 obj가 오면 실제로 넣어주는 정보는 오브젝트 클래스의 객체도 가능하지만
	//오브젝트 클래스를 상속받은 자식클래스들도 가능하다.
	public void print1(Object obj) { //Object = 모든 클래스들의 최상위
		//obj라는 객체가 클래스A로 형변환 가능한지를 확인하는 연산 : instanceof
		if (obj instanceof A) 
			System.out.println("A class로 형변환 가능합니다. ");
		else System.out.println("Object 입니다.");
	}
	//매개변수로 B클래스의 객체 obj가 오기때문에 실제 넣어주는 정보는 B클래스의 객체나 B클래스를 상속받은 A객체를 매개변수로 넣어줄 수 있다.
	public void print2(B obj) {
		System.out.println("B class obj 입니다.");
	}
}