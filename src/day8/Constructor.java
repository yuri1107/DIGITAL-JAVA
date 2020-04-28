package day8;

public class Constructor {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();
		/*
		int num1;
		int num2 = 10;
		num1 = num2; //num1의 값을 num2로 '초기화' 하는 부분
		int num3 = num1; // num3에 num1을 넣으려 하기 때문에 num1을 '사용'한 것
		*/
	}

}
//295페이지를 간단하게 예제로
class Point {
	int x=1;
	int y=1;
	{
		//초기화블럭
		//x=10;
		//y=10;
	}
	static {
		//class 초기화블럭
		//클래스변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)",x,y);
	}
	public Point(int x, int y) {
		//멤버변수 와 매개변수 이름이 같기때문에 this 붙여줌
		this.x = x;
		this.y = y;
	}
	public Point() {
		//this(0,0);
		this(100,101);
	}
	//복사 생성자
	public Point(Point p) {
		this(p.x,p.y);
		//this = p; //p는 참조변수로, 주소를 갖고있기때문에 에러가 난다.
		this.x = p.x;
		this.y = p.y;
		//this(p.x,p.y); //다른 생성자 this()를 이용할때는 무조건 첫번째 줄에 있어야 한다.
	}
}
