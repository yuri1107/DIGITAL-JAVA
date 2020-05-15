package day17;

import java.util.*;

public class VariableEx2 {
	/* 객체변수 : 대부분의 사용자 클래스의 멤버변수는 객체 멤버 변수이다.
	 * 클래스변수 : 동일한 클래스의 모든 객체들이 공유하는 정보가 있다면 클래스 멤버변수로 한다.
	 * 			특정정보를 편하게 확인하기 위해 클래스변수를 만든다.
	 * 멤버변수(클래스,객체) : 의미있는 정보를 클래스 안에 선언할 때 사용하는 변수
	 * 					해당 정보가 메소드 곳곳에서 사용할 때.
	 * 지역변수 : 메소드를 실행하는데 있어서 자체적으로 사용하는 변수
	 * 			외부에서 알려주는 정보와 상관없음
	 * 매개변수 : 메소드에서 기능을 실행하는데 있어 필요한 정보.
	 * 			메소드 안에서 매개변수 = 값; 과 같은 코드가 발생한다면 해당 매개변수는 지역변수로 바꿔도 되는 매개변수 이다.
	 *
	*/
	public static void main(String[] args) {
		Corona c1 = new Corona();
		List<Corona> list = new ArrayList<Corona>();
		list.add(c1);
		Corona c2 = new Corona();
		list.add(c2);
		System.out.println(Corona.cnt);
		System.out.println(list.size());
	}

}
class ClassRoom {
	int cnt = 0; //강의실의 학생 수
	int MaxCnt = 20; //강의실 정원
	String clasNum = "401호"; //강의실 호수
	List<String> courseNameList = new ArrayList<String>();
	//int i = 0; //메소드에서 반복문을 이용할 때 사용할 변수. 멤버변수로 만드는것은 부적절하다. (에러는 아님)
}
class GreenArtClass extends ClassRoom {
	static String companyName = "그린컴퓨터아트학원";
	
}
class Corona {
	String name;
	String address;
	static int cnt;
	int age;
	public Corona() {cnt++;}
}


/* 
 * 객체 멤버 변수 : static이 없는 멤버 변수, 각 객체들이 공유하지 않음
 * 			클래스 안의 객체 메소드 안에서 선언 없이 사용 가능
 * 클래스 멤버 변수 : static이 있는 멤버 변수, 각 객체들이 공유하는 변수
 * 			클래스 안의 클래스 메소드 안에서 선언 없이 사용 가능
 * 지역 변수 : 메소드 안에서 선언되는 변수들(매개변수 포함)로 해당 지역에서만 사용 가능
 * 매개 변수 : 메소드 선언부에서 () 안에 들어가는 변수들, 메소드를 실행하는데 있어 필요한 정보,매개변수는 지역변수
 * 일반 변수 : 자료형이 int처럼 기본자료형인 변수들로 값을 저장.
 * 참조 변수 : 일반변수가 아닌 변수로 클래스의 객체나 배열 등이 있으며, 주소를 저장.
 * ****모든 변수들은 일반변수 아니면 참조변수 이다.*********
 * 멤버변수이면서 지역변수가 될 수 있을까요? 안된다
 * 
 * 
 */