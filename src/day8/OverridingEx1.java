package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		Duck d = new Duck();
		d.cry();
		System.out.println(d.getWing());
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0);
		
	}

}


class Bird {
	protected int wing;
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() { wing = 2; }
	public Bird (int wing) { this.wing = wing;}
	//public 가 아닌 경우에는 겟,셋 모두 가져오는게 좋다.
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
}
class Duck extends Bird {
	//메소드 오버라이딩
	@Override
	public void cry() {
		System.out.println("오리 : 꽥꽥");
	}
}
class Sparrow extends Bird {
	int wing;
	//@Override  //현재 구문이 없어진다면 아래 매개변수도 없어야한다. 그렇게 하면 출력 문구도 달라짐. (메소드 오버로딩)
	public void cry(int num) {
		System.out.println("참새 : 짹짹");
	}
}