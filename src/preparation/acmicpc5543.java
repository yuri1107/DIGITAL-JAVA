package preparation;

import java.util.Scanner;
//https://www.acmicpc.net/problem/5543
public class acmicpc5543 {

	public static void main(String[] args) {
		int[] burger = new int[3];
		int[] drink = new int[2];
		
		int re = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < burger.length; i++) {
			re = scan.nextInt();
			if (burger[i] >= 100 && burger[i] <= 2000) {
				burger[i] = re;
			}//else { System.out.println("NO"); }
		}		
		for (int i = 0; i < drink.length; i++) {
			drink[i] = scan.nextInt();
			if (drink[i] >= 100 && drink[i] <= 2000) {
				drink[i] = re;
			}//else { System.out.println("NO"); }
		}
		
		//배열값중에 가장 작은 값을 가져와서 두개를 더하고 50원을 빼서 출력해야함
		int mb = burger[0];
		for (int tmp : burger) {
			if (tmp < mb) {	mb = tmp; }
		}
		int md = drink[0];
		for (int tmp : drink) {
			if (tmp < md)  {md = tmp;} 
		}
		
		System.out.println((mb+md)-50);
		
		scan.close();
	}

}
