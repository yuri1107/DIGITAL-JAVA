package day2;

public class RandomEx1 {

	public static void main(String[] args) {
		//
		
		int min = 0;
		int max = 10;
		int random = (int)(Math.random() * (max-min+1))+min;
		// min~max 사이에 있는 임의의 수 호출.
		random = (int)(Math.random()*(max-min+1)) + min;
			System.out.println(random);
		random = (int)(Math.random()*(max-min+1)) + min;
			System.out.println(random);
		random = (int)(Math.random()*(max-min+1)) + min;
			System.out.println(random);
		random = (int)(Math.random()*(max-min+1)) + min;
			System.out.println(random);
		random = (int)(Math.random()*(max-min+1)) + min;
			System.out.println(random);
		
	}

}