package day8;

public class InheritanceEx1 { //상속

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.print2();
		c1.setD(23);
		c1.print2();
	}
}
class Child extends Parent{
	private int e;
	Point p1 = new Point();
	public void print2() {
		System.out.printf("%d,%d \n",p1.x,p1.y); //위에서  Point p1 = new Point(); 라고 생성하지 않으면 에러가 뜬다.
		System.out.printf("%d,%d \n",x,y);
		//print(); //해당 메서드를 통해 부모클래스 Parent의 private 멤버변수를 확인 할 수 있다. (수정은 불가능)
		//System.out.println("a=%d, b=%d, c=%d, d=%d e=%d \n",a,b,c,d,e); //이렇게 호출하면 d도 확인은 가능하다.
		//setD(80); // 이 구문에서 80은 매개변수가 되는것
		System.out.printf("a=%d, b=%d, c=%d, d=%d e=%d \n",a,b,c,getD(),e);
	}
	
}
class Parent {
	//접근자별 멤버변수 선언
	public int a;
	protected int b;
	int c;
	private int d=30; //private 이기 때문에 자식새끼에서 확인은 가능하지만 수정은 불가능.
	public int x,y;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d \n",a,b,c,d);
	}
	
	//생성자만들기
	public Parent() {}
//	public Parent(int a, int b, int c, int d) {
//		this.a=a; this.b=b; this.c=c; this.d=d;
//	}
//	

	//우클릭 - source - Generate Constructor using Fields... 클릭. 체크박스는 매개변수로 쓰겠다 라는 뜻
	public Parent(int a, int b, int c, int d) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	//아래와 같이 get , set을 통해 값을 가져오고 수정 할 수 있다.
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}


	
}