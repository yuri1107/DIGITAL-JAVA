package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		//윗줄까지는 문제가 없음. 형변환도 안하고 알맞게 객체를 만들었으니까.
		
		Tv t1 = new CaptionTv(); // 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다. 
//		CaptionTv ct1 = new Tv(); // 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수 없다. 
		/* 자식객체를 생성하여 부모가 참조하는 경우에는 자식클래스의 멤버변수 power, ch, text가 만들어진 후
		 * 부모가 power와  ch만 사용하기 때문에 10번째 라인은 에러가 없음.
		 * 
		 * 부모객체를 생성하여 자식이 참조하는 경우에는 부모클래스의 멤버변수 power, ch 만 만들어진 상태에서
		 * 자식이 text를 사용하려 하면 문제가 되기 때문에 이경우는 에러.
		 * 
		 * 근데 부모클래스에다가 편하려고 변수를 싹 다 선언해버리면 쓸데없이 용량차지도 많이하고 설계도 복잡해지고 상속이라는 의미가 퇴색된다.
		 * 가장 좋은건 형변환으로 헷갈리지 않게 맞는 클래스에 맞는 객체를 만드는것.
		 * 
		 * 하지만 형변환은 필요하다. 예를들어 리스트, (배열이랑 비슷) 동일한 클래스 객체가 아닌것들을 담아야 할 때 부모를 지정해주면 좋다.
		*/
		t = ct; 			//자손타입 -> 조상타입 형변환
		
		//t = new Tv();		//이 코드가 없는경우는 아래의 형변환이 가능하지만 이 코드를 활성화하면 아래코드는 에러가 난다.
		/* 조상타입 -> 자손타입은 항상 가능한 것이 아니라 조건부로 가능하다.
		 * 상황에 따라서 에러 ClassCastException 이 발생한다.
		 * 가능한 경우는 부모객체 t가 [부모클래스를 통해 생성된 객체]가 아니라 [자식클래스를 통해 생성된 객체와 연결이 된 경우]는 가능
		*/
		ct = (CaptionTv)t;  //조상타입 -> 자손타입 형변환
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		
		//display 는 class메소드
		Tv.display(st);
		Tv.display(ct);
		
		
		
	}
}

class Tv {
	boolean power = false;
	int ch;
	// 아래는 토글형태 (스위치 처럼) 현재상태와 현재상태의 반대 밖에 없다
	void power() {	power = !power; }
	void chUp() { ch++; }
	void chDown() { ch--; }

	public static void display (Tv t) {
		if (t instanceof CaptionTv) {
			System.out.println("캡션TV");
			}
		else if (t instanceof SmartTv) {
			System.out.println("스마트TV");
			}
	}
}

//Tv를 상속받은 CaptionTv 클래스
class CaptionTv extends Tv {
	String text;
	void cation() { System.out.println("캡션 : " + text ); }
}

class SmartTv extends Tv {
	String ip;
}