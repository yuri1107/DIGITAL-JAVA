package day7;

import java.util.Scanner;

public class ClassEx3 {

	public static void main(String[] args) {
		// Scanner scan;  이라고 선언 할 수 없음. //클래스메서드와 변수가 생성
		//scan.nextInt(); // 안만들어졌기때문에 에러가 남
		//scan = new Scanner(System.in);// 객체 메서드와 변수가 생성
		//Scanner scan = new Scanner(System.in); //이라고 객체를 생성 해야 함 

		//클래스명.클래스메소드(); 혹은 객체.클래스메서드명 두가지 방법으로 클래스 메서드를 호출함.
		KiaCar.printInfo();
		KiaCar c1 = new KiaCar();
		//c1.printInfo(); //객체메소드는 이것밖에 못함. 이렇게도 접근은 가능하지만 권장하지는 않음. 위의 2가지 방법으로 호출하는걸 권장
		c1.printCarInfo();
		KiaCar.printInfo();
		KiaCar c2 = new KiaCar("뉴그랜드버드",6);
		c2.printCarInfo();
		KiaCar.printInfo();
		for(int i = 0; i < 10; i++) { //속력 1씩 올리는 반복문
			c2.speedUp();
			c2.printSpeed();
		}
		System.out.println("---------------------");
		for(int i = 0; i < 20; i++) { //속력 1씩 줄이는 반복문
			c2.speedDown();
			c2.printSpeed();
		}
		
	}
}

//파일명과 클래스명이 상이하기때문에 public class ㄴㄴ
//클래스명은 대문자로 시작


//모닝, K3, 쏘렌토 등등의 차량들로 클래스를 만드려고 한다.
class KiaCar {
	//클래스변수
	//모든 자동차가 가지고 있는 공통된 정보들
	private static String manufacturer = "KIA";  //함부로 바꾸면 안되기 때문에 private 접근제한자
	private static int salesNumber = 0; //판매 수량도 함부로 바꾸면 안되는거니까. 
	//위의 두가지 변수들은 확인용이고 수정용이 아니기 때문에 접근제한자가 프라이빗
	// static은 만들어지기 전에 확인이 가능하냐 만들어지고나서 확인이가능하냐 로 구분하면 된다. 만들어지기 전에 확인 가능하면 static
	
	//객체변수
	//모든 자동차가 가지고 있지만 제각각 다른 정보들
	int wheel; //이렇게 눈에 보이는 정보를 객체변수로 만들 수도 있고
	boolean power; //시동이 켜져있고 안켜져있고 라던가
	int speed; // 속도를 객체변수로 만들 수 도 있다.
	String carName; //차량 모델을 객체변수로 만들수도 있다.
	String carNum; // 차량 고유번호를 객체변수로 만들 수도 있다.
	
	//마우스 우클릭 소스 제너레이트 에서 get set을 가져오지만 수정할 의도가 없기 때문에 set은 가져오지 않는다.

	//클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void printInfo() {
		System.out.println("제조사 : " + manufacturer);
		System.out.println("판매량 : " + salesNumber + "대");
	}
	
	
	
	//객체 메소드
	public void turnOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	public void turnOff() {
		if (speed == 0) {
			System.out.println("시동이 꺼집니다.");
			power = false;
		}else { System.out.println("속도가 0이 아니라서 시동을 끌 수 없습니다.");}
	}
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		if(speed > 0)
			speed--;
	}
	public void printSpeed() {
		System.out.println("현재 주행 속도는 " + speed + "km/h 입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : " + carName);
		System.out.println("바퀴 수 : " + wheel);
		
		printSpeed();
	} 
	
	//생성자
	//생성자는 모두 public로 한다 고 쌤이 그랬음
	//교재 300p. 
	public KiaCar() {
		wheel = 4; //멤버변수는 파란색으로 표기됨
		carName = "뚜벅이";
		salesNumber ++;
	}
	// 생성자 오버로딩
	public KiaCar(String carName, int wheel) {
		this.carName = carName;
		//wheel = wheel; // 여기 있는 wheel은 매개변수 wheel이다. 
		/*멤버변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
		 * 이런경우 멤버변수를 의미하기 위해 변수명 앞에 this와 .을 써서 
		 * this.멤버변수명 으로 사용한다. this는 자기 자신을 의미하는 객체*/
		this.wheel = wheel; // 매개변수 wheel (오른쪽)을 멤버변수 wheel (왼쪽) 으로 넣는다. 
		salesNumber ++;
	}
	
}