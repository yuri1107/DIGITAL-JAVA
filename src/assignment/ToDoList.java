package assignment;

import java.util.*;
//200513자습예제 ArrayList 활용
public class ToDoList {
/*
오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요.

예)
오늘의 할일을 추가하시겠습니까?(y/n) : y
오늘의 할일을 입력하세요 : 수업
오늘의 할일을 추가하시겠습니까?(y/n) : y
오늘의 할일을 입력하세요 : 점심
오늘의 할일을 추가하시겠습니까?(y/n) : n
오늘의 할일
1.수업
2.점심
프로그램을 종료합니다.
*/
	public static void main(String[] args) {
		
		ArrayList<Calender> list = new ArrayList<Calender>();
		Scanner scan = new Scanner(System.in);
		
		for ( ; ; ) {
			System.out.print("오늘의 할일을 추가하시겠습니까?(y/n) : ");
			char confirm = scan.next().charAt(0);
			
			scan.nextLine();
			if (confirm == 'y' || confirm == 'Y') {
				System.out.println("오늘의 할일을 입력하세요 : ");
				list.add(new Calender(scan.nextLine()));
			}
			if (confirm == 'n' || confirm == 'N') {
				System.out.println("오늘의 할일");
				printList(list);
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}


	} //main close
	private static void printList(List<Calender> list) {
		int i = 1;
		for (Calender tmp: list) {
			System.out.println(i + ". "+ tmp + " ");
			i ++;
		}
		//System.out.println();
	}
} //class close
class Calender{
	String Calender;
	
	@Override
	public String toString() {
		return Calender;
	}
	public Calender() {}
	public Calender(String Calender) {this.Calender = Calender;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Calender == null) ? 0 : Calender.hashCode());
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
		Calender other = (Calender) obj;
		if (Calender == null) {
			if (other.Calender != null)
				return false;
		} else if (!Calender.equals(other.Calender))
			return false;
		return true;
	}

	

	
}
