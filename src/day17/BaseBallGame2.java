package day17;

import java.util.*;

public class BaseBallGame2 {

	public static void main(String[] args) {
		//1. 컴퓨터가 생성한 랜덤한 수를 저장하는 리스트 생성 : com
		List<Integer> com = new ArrayList<Integer>();
		//2. 사용자가 입력한 수를 저장하는 리스트 생성 : user
		List<Integer> user = new ArrayList<Integer>();
		int size = 3;
		int min =1, max = 9;
		//3. 중복되지 않은 랜덤한 수 3개를 com에 저장
		com = createRandomList(size, min, max);
		System.out.println(com);
		//4. 사용자가 중복되지 않은 세 수를 입력하여 맞출때까지 반복
		//4-1. 스트라이크의 갯수가 3개가 될때까지 반복
		int strike = 0, ball = 0;
		Scanner scan = new Scanner(System.in);
		
		while (strike != size) {
			
			//4-2. 정수 세개를 입력받아 중복된 내용이 있으면 다시 입력받게 함
			user.clear();
			/*
			int i = 0;
			System.out.print("중복되지 않은 숫자 3개를 입력하세요 (1 ~ 9) : ");
			while (i++ < size) user.add(scan.nextInt());
			i = 0;
			List<Integer> tmpList = new ArrayList<Integer>();
			while (user.size() != 0) {
				int tmp = user.remove(0);
				if (user.contains(tmp)) {
					break;
				}
				tmpList.add(tmp);
			}
			*/
			//중복된 숫자가 있는 경우
			if (! insertUser(scan, min, max, user, size)) {
				System.out.printf("입력한 숫자중에 중복된 숫자가 있거나 입력된 숫자가 " + " %d 에서 ~%d사이의 숫자가 아닙니다.\n",min,max);
				continue;
			}
			System.out.println(user);
			//4-3. 스트라이크와 볼을 판별.
			strike = 0;
			ball = 0;
			for (int i = 0; i < com.size(); i++) {
				//스트라이크의 갯수 판별
				if (com.get(i) == user.get(i)) {
					strike++;
				}
				//스트라이크 + 볼의 갯수 판별
				if (com.contains(user.get(i))) {
					ball++;
				}
			}
			ball = ball-strike;
			//4-4. 판별한 스트라이크와 볼을 이용하여 출력
			if (strike != 0) {
				System.out.print(strike + "S ");
			}
			if (ball != 0) {
				System.out.print(ball + "B ");
			}
			if (strike == 0 && ball == 0 ) {
				System.out.print("3O");
			}
			System.out.println();
		}
		System.out.println("정답입니다.");
	} // main close
	
	public static int random(int min, int max) {
		if (max < min) {
			throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		}
		return new Random().nextInt(max-min+1)+min;
	}
	/*메소드를 만들땐 언제나 이것을 정리해라. 기능, 매개변수, 리턴타입, 메소드명
	 * 기능 : min~max 사이의 중복되지 않은 랜덤한수 size개를 com에 저장 (랜덤한 수를  중복되지않게 size개만큼 com에 저장하여 반환하는 메소드)
	 * 매개변수 : 갯수, 최소값, 최대값  => int size,int min, int max
	 * 리턴타입 : List com (랜덤한 수가 저장된 리스트=>List<Integer>) 
	 * 메서드명 : createRandomList
	 * */
	public static List<Integer> createRandomList (int size, int min, int max) {
		if (size > max-min+1) {
			throw new ArithmeticException("예외발생 : 랜덤 범위보다 만들어야 하는 갯수가 더 많습니다.");
		}
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random(min, max);
			if (!list.contains(r)) {
				list.add(r);
			}
		}
		return list;
	}
	/* 기능 : Scanner를 통해 정수를 size개 입력받아 입력받은 정수가 min ~ max사이이고 중복되지 않으면 리스트에 저장한 후
	 * 		리스트 생성 여부를 알려주는 메소드
	 * 매개변수 : 스캐너, 최소값, 최대값, 리스트, 갯수 = > Scanner scan, int max, int min, List<Integer> user,int size
	 * 리턴타입 : boolean
	 * 메소드명 : insertUser
	 * */
	
	public static boolean insertUser(Scanner scan, int min, int max, List<Integer> user, int size) {
		int i = 0;
		System.out.print("중복되지 않은 숫자 3개를 입력하세요 (1 ~ 9) : ");
		while (i++ < size) user.add(scan.nextInt());
		i = 0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while (user.size() != 0) {
			int tmp = user.remove(0);
			//입력된 수가 min보다 작거나 max보다 크거나 중복이 되면
			if (tmp < min || tmp > max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);
		}
		// user = tmpList; // 이렇게 작성하면 원본에 tmpList 값이 추가되지 않음.
		user.addAll(tmpList);
		return true;
	}

}// class close
