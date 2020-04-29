package day9;

public class InheritanceEx2 {

	public static void main(String[] args) {
		Shape s1 = new Shape (5,5,10,10);
		s1.print();
		s1.resize(4.8, 5.72); //resize의 자료형은 double이기 때문에 소수도 가능
		s1.move(10, 10);
		s1.print();

		Square sq1 = new Square(5,5,10,10); //클래스 Square 에 생성자가 없기 때문에 에러가 남.
		//Square sq1 = new Square(); // 클래스 생성자가 없으면 기본생성자가 만들어지기때문에 이건 에러가안남. 
		//윗줄에서 만들어지는 구문 : Shape를 상속받은 Square class 에 public Square (){} 가 생성됨
		sq1.print();		
		//아래 세 줄은 상속받은 멤버를 활용한 덮어쓰기
		sq1.move(78,78);
		sq1.resize(66.66, 54.88);
		sq1.print();
		
		Circle c1 = new Circle(0,0,5);
		c1.print();
		c1.move(0, 5);
		c1.print();
		
		c1.resize(2);
		c1.print();
		
		Circle c2 = new Circle();
		Shape.printCount(); //Shape 클래스 안에 있는  printCount() 메서드 호출
		//Circle.printCount(); //부모꺼를 상속받으니 Circle 클래스 안에 있는 메서드를 호출해도 결과는 같다.
		
		Square.printCount();
		Circle.printCount();
		
	}

}