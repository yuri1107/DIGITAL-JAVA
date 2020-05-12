package assignment;

public class PointClass {
/*
다음 조건을 만족하는 클래스를 생성하세요.
1. 클래스 이름은 Point로 2차원 좌표평면의 점을 나타내는 클래스이다.
2. 멤버변수는 좌표x와 좌표y가 있다. //x,Y
3. 두 점이 주어졌을 때 두 점이 같은지를 비교하는 equals() 메소드를 오버라이딩 해야한다. //우클릭 
4. 좌표의 점을 확인하기 위한 toString() 메소드를 오버라이딩해서 확인한다.  //우클릭
5. 생성자를 이용하여 멤버변수를 초기화한다. //이거 내가 개못하는거
6. 두 점의 거리를 계산하는 distance()메소드를 구현해야한다.
 - 공식 : 루트( (x2-x1)의 제곱 + (y2-y1)의 제곱 ) //
 - 제곱 함수 : Math.pow(a,b) => a의b제곱
 - 루트 함수 : Math.sqrt(c) => 루트 c
클래스를 생성한 후 main() 메소드에서 테스트하세요.
*/

	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,5);
		System.out.println(p1 + "과 " + p2 + "의 거리는 "+p1.distance(p2)+"입니다.");
		System.out.println(p1 + "과 " + p2 + "는 같은 점 입니까 ? : " + p1.equals(p2));
		p2.setX(0);
		p2.setY(0);
		System.out.println(p1 + "과 " + p2 + "는 같은 점 입니까 ? : " + p1.equals(p2));

	} //main메소드 끝나는 부분

} //PointClass 끝나는괄호
class Point {
	private int x; //x좌표
	private int y; //y좌표
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}

	@Override
	public String toString() {
		//return "Point [x=" + x + ", y=" + y + "]";
		return  "(" + x + ", " + y + ")" ;
	}


	@Override
	public boolean equals(Object obj) {
		//obj와 this가 같은 객체를 공유하고 있는 경우
		if (this == obj) return true; //이건 없어도 되는데 결과 빨리 낼라고 넣어주는거
		//비교할 점 obj가 없는 경우
		if (obj == null) return false;
		// 비교할 obj가 Point클래스가 아닌 경우
		if (getClass() != obj.getClass()) return false;
		//obj가 Point클래스의 객체인 경우 (형변환 가능)
		Point other = (Point) obj;
		if (x != other.x) return false;
		if (y != other.y) return false;
		return true;
	}
	
	public double distance(Point other) {
		int distX = x-other.x;
		int distY = y-other.y;
		//double res = Math.sqrt(Math.pow(distX,2.0) + Math.pow(distY,2.0)); //어차피 리턴할거니까 변수 안만들고 걍 바로 리턴
		return Math.sqrt(Math.pow(distX,2.0) + Math.pow(distY,2.0));
	}

} 
