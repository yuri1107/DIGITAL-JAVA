package day23;

import java.util.*;

public class SetTest1 {
	//set은 631p
/* 중복되지 않는 정수 5개를 set에 저장하고,저장된 값의 합과 평균을 구하세요.
*/
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		/*
		HashSet<Integer> hs = new HashSet<Integer>();
		int size = 5;
		int sum = 0;
		double avg = 0.0;
		
		
		for (int i = 0; i < size; i++) {
			int tmp = scan.nextInt();
			if(hs.contains(tmp)) { 
				hs.remove(tmp);
			}
			hs.add(tmp);
		}
		
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer tmp = it.next();
			if (tmp != null) sum += tmp;
		}		
		
		System.out.println("입력 : " + hs);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / size);
		*/
		
		Set<Integer>set = new HashSet<Integer>();
		int size = 5;
		//문제에서 정수 5개를 입력받는게 아니라 '중복되지 않은' 정수 5개를 입력받아야 하기 때문에 반복횟수는 5번으로 고정된 것이 아니라
		//set에 5개가 저장될 때까지 반복해야 한다.
		for ( ;set.size() < size; ) {
			set.add(scan.nextInt());
		}
		Iterator<Integer> it = set.iterator();
		int sum = 0;
		while (it.hasNext()) {
			Integer tmp = it.next();
			if (tmp != null) sum += tmp;
		}
		System.out.println(sum);
		double avg = (double) sum / set.size();
		System.out.println(avg);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); 	list.add(2);
		System.out.println(sum(list));
	}
	//아래 sum 메소드는 매개변수가 Collection 인터페이스를 구현한 모든 객체이기 때문에 Set, List 둘다가능 (재사용성이 높아짐)
	public static int sum (Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer tmp = it.next();
			if (tmp != null) sum += tmp;
		}
		return sum;
	}

}
