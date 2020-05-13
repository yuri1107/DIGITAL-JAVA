package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionEx1 {

	public static void main(String[] args) {
		/* Num클래스의 객체만 저장 가능한 list를 ArrayList로 생성
		 *
		*/
		ArrayList<Num> list = new ArrayList<Num>();
		list.add(new Num()); // 이름없는객체를 만들어서 추가
		
		//쌤주석 : Ch클래스를 이용한 객체는 Num클래스를 이용한 객체가 아니므로 에러 발생
		//list.add(new Ch()); // Num만 가능한 list에 Ch클래스의 객체를 추가하려고 해서 에러
		//list.add(new Num2()); // Num만 가능한 list에 Num2의 객체를 추가하려고 하지만 상속받은 자식클래스가 추가하려고 하기때문에 에러발생안함 (자동형변환때문에)
		//쌤주석 : Num클래스를 상속받은 자식클래스 Num2를 이용한 객체는 에러 발생하지 않음. 자식클래스를 부모클래스로 자동형변환할 수 있기 때문에.
		
		list.add(new Num());
		list.add(new Num(1));
		list.add(new Num(100));
		printList(list);
		
		list.remove(new Num()); //equals로 확인해서 있으면 지우긔 
		
		System.out.println("Num가 0인 객체를 지운 후 list출력");
		printList(list);
		
		ArrayList<Num> list2 = new ArrayList<Num>(list);
		System.out.println("복사 생성자를 이용한 list2");
		printList(list2);
		list.add(1,new Num(200));
		System.out.println("1번지에 200을 추가후 list");
		printList(list);
		list2.clear();
		System.out.println("list2를 clear한 후 list2");
		printList(list2);
		list2.addAll(list);
		System.out.println("list를 list2에 addAll한 후 list2");
		printList(list2);
		System.out.println("향상된 for문을 이용하지 않은 반복문 for ");
		for (int i = 0; i < list.size(); i++) { // size는 저장된 객체의 수를 의미
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("iterator를 이용한 출력문");
		Iterator<Num> it = list.iterator(); //이건 그냥 외우라고 함.
		
		while(it.hasNext()) { // hasNext()가 다음것이 있는지 없는지 확인하고 참 거짓으로 반환.
			Num tmp = it.next();
			System.out.print(tmp + " ");
			//System.out.print(it.next() + " ");
		}
		System.out.println();
		list.ensureCapacity(100); //배열리스트의 용량이 최소 한 ()가 되도록한다.
	
		
		List<Num> list3 = list.subList(0,2); //0번지부터 2번지의앞번지 (0~ 2-1 까지) 사이의 부분리스트. 반환값은 리스트
		System.out.println("0번지에서 2번지 사이의 부분 리스트 (2번지 제외)");
		printList(list3);
		
		/*
		 익명클래스는 주로 메소드에서 인터페이스를 구현한 클래스가 필요한데
		 해당 메소드가 기능이 하나 뿐이어서 따로 정의하기 애매한 경우 익명클래스를 이용한다.
		*/
		list.sort(new Comparator<Num>() { //메서드같아보이겟지만 클래스임 그것도 익명클래스임 어떤클래스인지 이름이없기때문에.
			@Override
			public int compare(Num n0, Num n1) {
				if(n0.num > n1.num) return 1;
				if(n0.num < n1.num) return -1;
				//내림차순으로 바꾸고싶으면 리턴값을 서로 바꿔주면 됨
				return 0;
			}
		});
		
		System.out.println("Comparator 후 list");
		printList(list);
		
	} //main 메서드 끝

	private static void printList(List<Num> list) {
		for (Num tmp: list) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
class Num{
	int num;

	@Override
	public String toString() {
		
		return "[num=" + num + "]";
	}
	public Num() {}
	public Num(int num) {this.num = num;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class Num2 extends Num {}
class Ch {
	char ch;

	@Override
	public String toString() {
		return "Ch [ch=" + ch + "]";
	}
	
}