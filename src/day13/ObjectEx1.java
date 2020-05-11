package day13;

/* 얕은복사 깊은복사 참고-교재 459p
 * 메모장 - 200511
*/
public class ObjectEx1 {

	public static void main(String[] args) {
		/* a1에서 만든 객체를 a2가 같이 공유한다
		 * */
		System.out.println("-------------얕은복사 예제------------");
		A a1 = new A(); //생성연산자 new를 통해 A클래스에 a1이라는 객체를 생성해 넣어라
		A a2 = a1; //A클래스의 a2객체의 값을 a1로 대입해넣어라. (공유해라)
		
		System.out.println(a1.num+","+a2.num);
		a1.num = 20;
		System.out.println(a1.num+","+a2.num);
		a2.num = 30;
		System.out.println(a1.num+","+a2.num);
		try {
			A a3 = (A)a1.clone(); // 클론의 리턴타입은 Object 이기 때문에 부모를 자식으로 형변환하기 위해 자식의 클래스 이름을 명시해준다.
			a3.num = 40;
			System.out.println(a1.num+","+a3.num);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-------------깊은복사 예제------------");
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone(); // 여기는 형변환을 안해줘도 됨. 이유는 선생님께
		//protected 접근제한자는 나와 내 자식, 같은패키지 만 가능. 그래서 접근하려고 public 로 오버라이딩을 해줘야함.
		System.out.println(b1.a.num + "," + b2.a.num); //얕은복사
		b2.a.num = 30; //얕은복사
		System.out.println(b1.a.num + "," + b2.a.num); //얕은복사
		//b1.a 와 b2.a 둘다 num과 연결되어 있기 때문에 num을 바꾸면 연결된 두 객체 모두 값이 바뀌는것.
		System.out.println("-------------equals 예제------------"); //equals = 비교해서 결과를 불리언으로 알려주는 역할.
		A a4 = new A();
		A a5 = new A();
		System.out.println(a4.num + "," + a5.num); //참조변수의 초기값은 null이기때문에 둘다 0이 나옴
		System.out.println(a4.equals(a5)); //참조변수는 주소를 가지고 있기때문에 같은 주소를 갖고있지 않기때문에 false가 나옴. 지금은 예제하면서 같은 주소로 바꼇기 때문에 true
		
		
		
	}

}
class A implements Cloneable{  //clone  쓸라면 implements Cloneable 필요함. 오버라이딩도 필요함
	int num;
	@Override
	public Object clone() { // clone() = 객체를 복제하는 메서드 예외 발생 가능한 상황이라 throws 기술,
		//런타임에러가 아니기 때문에 생략이 불가능한 CloneNotSupportedException 에러이기때문에 꼭 기술해줘야함
		Object obj = null;
		try {
			obj = super.clone();
		}catch (Exception e) {
			System.out.println("예외");
		}
		return obj;
	}
	public A() {}
	public A (int num) {
		this.num = num;
	}
	@Override
	public int hashCode() { //교재 453p 참고
		final int prime = 31; 
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 같으면
			return true;
		if (obj == null) //obj의 값이 null이면. 여기까지 왔다는건 위에서 NullPointerException이 발생하지 않았다는것
			return false;
		if (getClass() != obj.getClass()) //쟤클래스랑 내 클래스가 같지 않으면 볼 필요가 없다.
			return false;
		//if (!(obj instanceof A)) { return false; } //와 윗줄 (getClass)은 같다.
		A other = (A) obj; //여기까지 왔다는것은  obj객체를 A로 형변환 할 수있다.
		if (num != other.num)
			return false;
		return true;
	}
	
}

class B implements Cloneable{
	A a; //클래스 B의 참조변수 a (멤버변수) (참조변수는 초기값이 null임)
	@Override
	public B clone() {
		B obj = null;
		try {
			obj = (B)super.clone();
		}catch (Exception e) {
			System.out.println("예외");
		}
		if (obj instanceof B) {
			obj.a = new A(((B) obj).a.num);
		} //원본은 냅두고 따로 카피본을 만들기위한. (원본이랑 객체 연결고리는 끊어지고 원본과 카피본에 연결고리가 생기고, 카피본과 객체 연결고리가 생긴다.)
		return (B)obj; // 클론의 리턴타입은 Object 이기 때문에 부모를 자식으로 형변환하기 위해 자식의 클래스 이름을 명시해준다.
	}
}
class C {
	int num1, num2, num3, num4, num5;
	
	@Override
	public String toString() {
		return ("C [ num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3 + ", num4 = " + num4 + ",num5 = " + num5);
	}
}