package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		/*지역변수는 자동초기화가 안됨*/
		final double PI = 3.141592; // final을 붙였으므로 상수로 변함. 최초 1회만 초기화 가능,이 이후에 값을 바꿀 수 없음
	//	System.out.println(PI);
		//PI = 3.45; //에러발생 : 초기화 된 final 변수(이제는 상수)의 값을 수정하려 했기 때문에.
		
		A a = new A(); //final class에도 새로 생성이 가능하고 사용도 가능하다. 누군가의 자식이 될 수는 있지만 자식을 낳을수 없는 고자의 몸이 된다
	//	a.print(); //a의 안에 있는 멤버 print()메서드를 호출

		int ad = 12;
		int arr[] = new int [ad];
		System.out.println(arr.length);
		//arr.length = 11; //이라고 할 수가 없음. 해당 메소드에서 final변수로 선언했기때문에 수정할 수 없음.
		
		
		//난 이걸 배열의 길이와 for문의 반복조건을 변수라던가 뭐 다른걸로다가 통일시키고싶다
		Array array = new Array(ad);
		array.push(1); //0번지
		array.push(2); //1번지
		array.push(3); //2번지
		array.push(4); //3번지
		System.out.println(array.get(3));
		System.out.println(array.get(4));
		System.out.println("윗줄까진 4개넣었었다 ~!!!!!!!");
		
		for (int i = 0; i < ad; i ++) {
			System.out.println(array.pop());
		}
	}
	

}

class C {}

final class A extends C { // 멤버메소드는 print밖에없는 아주 간단한 final 클래스
	public void print() {
		System.out.println("A class");
	}
}

class B { //extends A {//class A는 final 클래스이기 때문에 상속하려 하면 에러 발생 }
	
}

class D {
	//print 메서드에 final을 붙이면 아래 클래스 E에서 print 메서드를 오버라이드 할 수 없다. 하려고하면 에러발생.
	public /*final*/ void print() { //public final void print() 이라고 정의하게 되면 다른 클래스에서 같은 이름의 메소드(오버라이딩)을 할 수 없게된다.
		System.out.println("D class");
	}
}

class E extends D {
	@Override
	public void print() {
		System.out.println("E class");
	}
}

class Array{
	//public final int length; //final 멤버변수도 0으로 자동 초기화 되지만 한번 정하면 바꿀 수 없기때문에 다시한번 확인하라고 문법적으로 막아 빨간밑줄이 쳐지는것. 
	//부동산계약서처럼 직접 확인하라는것
	public final int length;
	private int arr[]; 
	private int index = 0; //현재 저장된 원소의 수
	public Array() {
		length = 10; // 위에서 배열을 생성할때 배열의 길이가 정해지지 않으면 10칸짜리를 만들겠다고 하는것.
		arr = new int[length];
	}
	public Array (int length) {
		this.length = length;
		arr = new int [length];
	}
	public void push(int num) {
		if (index < length) {
			arr[index] = num;
			index++;
		}
		/* 
		else {
			1. 안내메세지만 처리 (System.out.print)
			2. 배열을 확장하여 추가하는 경우
		}
		*/
	}
	public int get(int index) { //index에 있는 값을 확인하기 위한 메서드
		if (this.index > index) {
			return arr[index];
		}return 0; // 잘못된 접근이기 때문에 예외처리 클래스를 이용하여 처리해야 하는데 아직 안배워서 0 (false) 으로 처리
		// throw new Exception ("값을 확인 ㄴㄴ"); 이런게 예외처리
	}
	public int pop() { //값을 빼는것 
		if (index == 0) { //index가 저장된게 없으면 이라는 조건문
			return 0; // throw를 이용하여 예외를 발생시켜야 하는데 아직 안배워서 0으로 리턴
		}
		return arr[--index]; //return을 만나면 아예 끝나버리기때문에 아랫줄에 따로 index--; 라고 기술할 수 없음.
		/* index--;
		 * int res = arr[index];
		 * return res;
		 * 이렇게 세줄로 표현해도 가능 
		*/
	}
}