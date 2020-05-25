package day23;

import java.util.*;

public class TestEx1 {
/* - 정수 5개를 입력받아 리스트에 저장하고,
 * 저장된 값들의 합과 평균을 구하는 코드를 작성하세요.
*/
/* - 합과 평균을 메소드를 이용하여 확인하도록 작성하세요.
*/
/* - Iterator 을 이용하여 작성하세요.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		cal(scan, list);
		*/
		
		/* List는 지네릭스 클래스이기 때문에 <> 안에 클래스명을 넣어주어야 하고,
		 * int는 클래스가 아니기 때문에 int의 래퍼클래스인 Integer를 넣어줌.
		 * 인터페이스인 List는 List 인터페이스를 구현한 ArrayList 클래스의 객체를 저장할 수 있다.
		 * 추상메소드와 상수로만 이루어진 것을 인터페이스 라고 한다.
		 * 추상메소드란 메소드의 선언부만 있고, 구현부가 없는 메소드를 말한다.
		 * 생성자에 추가한 5는 리스트의 size()가 아닌 용량을 의미한다.
		 * 리스트의 size()메소드는 현재 저장된 객체의 갯수를 의미.
		 * 리스트 안에는 배열로 되어 있는데, 이때 만들어진 배열의 크기가 용량이다.
		*/
		
		List<Integer> list = new ArrayList<Integer>(5);
		//List는 인터페이스이기 때문에 객체를 생성할 수 없다.
		//List<Integer> list2 = new List<Integer>();
		int size = 5;
		for (int i = 0; i < size; i++) {
			int tmp = scan.nextInt();
			/* 정수를 입력받아 tmp에  저장한 후 리스트의 add메소드를 이용하여 추가하는데,
			 * 이때 정수 tmp를 Integer클래스의 객체로 변환하여 저장한다. (오토박싱/언박싱)
			*/
			list.add(tmp);
		}
		int sum = 0;
		double avg = 0.0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			/* Iterator 를 생성할 때 Iterator의 <>를 입력하지 않으면 Object가 자동으로 들어가는데,
			 * 그렇게 되면 it.next()를 통해 가져오는 정보의 클래스도 Object가 되기 때문에 명시적 형변환이 필요.
			 * 아랫줄을 형변환한다면 
			Integer tmp = (Integer)it.next(); 와 같다.*/
			Integer tmp = it.next();
			//래퍼 클래스를 이용할 때 주의할 사항
			/* int는 정수형을 저장하고, Integer는  정수형과 null을 저장.
			 * 따라서 Integer의 객체를 int로 저장하는 경우 Integer의 객체가 null인지 아닌지 판단할 필요가 있다. */
			if (tmp != null) sum += tmp;
		}
		avg = (double) sum / list.size();
		sum = sum(list);
		avg = avg(list);
		System.out.println(sum);
		System.out.println(avg);
		
		scan.close();
	}
	
	public static int sum(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			//실행문
			Integer tmp = it.next();
			if(tmp != null) sum += tmp;
		}
		return sum;
	}
	public static double avg(List<Integer> list) {
		return (double)sum(list) / list.size();
	}
	/*
	public static void cal (Scanner scan, ArrayList<Integer> list) {
		int sum = 0;
		
		for (int i = 0; i < 5; i++ ) {
			System.out.println("정수를 입력하세요");
			int tmp = scan.nextInt();
			list.add(tmp);
			sum += tmp;
			
		}
		System.out.println("배열 안의 값들 : " + list); // 리스트 안에 있는 요소들을 모두 배열로 출력
		System.out.println("합계 : " + sum); // 합 구하기
		System.out.println("평균 : " + sum / list.size()); // 평균 구하기
		
		for (int i = 0; i < list.size(); i++) {
			Iterator<tmp>;
		}
	}
	*/
	

}
