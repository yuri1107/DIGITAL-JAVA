package day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		
		// 제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리 할 수 있다.
		/*
		Car [] arr = new Car[10]; // 입고된 차량을 관리하기 위한 배열. 기아가 올지 현대가 올지 모르니까 부모가 되는 자동차에 만듦
		arr[0] = new KiaCar();
		arr[1] = new HyundaiCar();
		*/
		// 아래보다 위가 더 관리가 편하다. 아래는 하나 하나 일일히 관리해야해서 데이터가 많아지면 힘든데 위에껀 부모 크기를 크게 만들어서 관리하면 데이터가 많아도 편함.
		
		// 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어서 관리해야 한다.
		/* 부모꺼를 이용하지 않고 제조사별로 관리하기 위한 코드 (제조사가 많아질 수록 복잡해짐)
		KiaCar Karr[] = new KiaCar[10];
		HyundaiCar harr [] = new HyundaiCar[10];
		karr[0] = new KiaCar();
		harr[0] = new HyundaiCar();
		*/
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그렌져");
		
		showCar(arr);
	}
	public static void showCar (Car []arr) {
		System.out.println("----입고된 차량 리스트----");
		for(int i = 0; i <arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i] instanceof KiaCar) {
				System.out.println(arr[i].manufacturer + " : " + arr[i].name + " 차량은 " + ((KiaCar)arr[i]).kia);
				}
				if (arr[i] instanceof HyundaiCar) {
				System.out.println(arr[i].manufacturer + " : " + arr[i].name + " 차량은 " + ((HyundaiCar)arr[i]).h);
				}
			}
		}
	}
}

class Car {
	int wheel; //휠
	String type; //타입
	String manufacturer; //제조업체
	String name; 
	
	//생성자 만들기
	public Car () {}
	public Car (String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	} 
	
}

class KiaCar extends Car {
	String kia = "기아자동차 입니다. "; 
	public KiaCar() {manufacturer = "Kia";}
	public KiaCar(String name) {
		super("Kia",name);
	}
}
class HyundaiCar extends Car {
	String h = "현대자동차 입니다. "; 
	public HyundaiCar() {manufacturer = "Hyundai";}
	public HyundaiCar(String name) {
		super("Hyundai",name);
	}
}