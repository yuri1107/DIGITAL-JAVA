package day4;

public class StringEx1 {

	public static void main(String[] args) {
		/* 교재 206,207쪽!
		 *
		*/
		String str = "홍유리"; 
		String str1 = new String("임꺽정"); //이라고도 선언 가능
		String arr[] = new String[3];
		
		arr[0] = str;
		arr[1] = str1;
		arr[2] = "이순신";
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// System.out.println(str);
		
		

	}

}
