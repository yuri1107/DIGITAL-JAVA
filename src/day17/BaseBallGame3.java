package day17;

import java.util.*;


public class BaseBallGame3 {
	public static void main(String[] args) {
		BaseBallGame.set(1, 20);
		BaseBallGame.play();
	}
}



class BaseBallGame {
	static int min = 1, max = 9, size = 3;
	static int strike = 0, ball = 0;
	static List<Integer> user = new ArrayList<Integer>();
	static List<Integer> com = new ArrayList<Integer>();
	
	static Scanner scan = new Scanner(System.in);
	
	public static void set(int min1, int max1) {
		min = min1;
		max = max1;
	}
	public static void play() {
		com = createRandomList();
		System.out.println(com);
		
		while (strike != size) {
			user.clear();
			if (! insertUser()) {
				System.out.printf("입력한 숫자중에 중복된 숫자가 있거나 입력된 숫자가 " + " %d 에서 ~%d사이의 숫자가 아닙니다.\n",min,max);
				continue;
			}
			System.out.println(user);
			strike = 0;
			ball = 0;
			for (int i = 0; i < com.size(); i++) {
				if (com.get(i) == user.get(i)) strike++;
				if (com.contains(user.get(i))) ball++;
			}
			ball = ball-strike;

			if (strike != 0) System.out.print(strike + "S ");
			if (ball != 0) System.out.print(ball + "B ");
			if (strike == 0 && ball == 0 ) System.out.print("3O");
			System.out.println();
		}
		System.out.println("정답입니다.");
		scan.close();
	}
	
	public static int random(int min, int max) {
		if (max < min) throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	
	private static int random() {
		if (max < min) throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	public static List<Integer> createRandomList () {
		if (size > max-min+1) throw new ArithmeticException("예외발생 : 랜덤 범위보다 만들어야 하는 갯수가 더 많습니다.");
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random();
			if (!list.contains(r)) {list.add(r);}
		}
		return list;
	}
	
	private static boolean insertUser() {
		int i = 0;
		System.out.print("중복되지 않은 숫자 " + size + "개를 입력하세요 (" + min + " ~ " + max + ") : ");
		while (i++ < size) user.add(scan.nextInt());
		i = 0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while (user.size() != 0) {
			int tmp = user.remove(0);
			if (tmp < min || tmp > max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);
		}
		user.addAll(tmpList);
		return true;
	}

}// class close
