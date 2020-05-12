package day14;

public class TestEx4 {

	public static void main(String[] args) {
		print();
		print("-----");
		print('-',10);
		System.out.println(print2('&',10));
	}
	public static void print() {
		System.out.println("*****");
	}
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print(char ch, int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	public static String print2(char ch, int cnt) {
		StringBuffer res = new StringBuffer(cnt);
		
		for (int i = 1; i <= cnt; i++) {
			res.append(ch);
		}
		return res.toString();
	}
	
	
	
	
	public static void star (char st,int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(st);
		}
	}
}
