package day13;

public class StringEx1 {

	public static void main(String[] args) {
		/*쌤주석 : str1과 str2는 둘다 abc라는 문자열 리터럴을 저장하기 때문에 같은 주소를 가진다. 
		 * (문자열 리터럴은 재사용을 하기 때문에)
		 * str2에 abc를 저장하기 전에 리터럴을 저장하는 메모리에 abc가 있는지 확인하여
		 * 있으면 새로 만들지 않고 재사용한다. 그래서 str1에 사용된 abc를 재사용하기 때문에
		 * str1과 str2의 주소는 같다.*/
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2); //String str2 = str1; 이 아니지만 주소가 같음. 따라서 true가 된다. (처음 둘다 abc로 초기화직후 출력시)
		//왜냐하면 교재 465p에서 말한것과 같이 문자열 리터럴은 이미 존재하는것을 재사용하기 때문이다.

		String str3 = new String ("abc");
		String str4 = new String ("abc");
		str3 = str3.intern();
		str4 = str4.intern();
		System.out.println(str3 == str4); // new 객체 생성연산자를 이용해 새로운 객체를 생성했기때문에 주소가 다름.
		System.out.println(str3.contentEquals(str4)); //주소가 아닌 값을 비교할 수 있도록 이미 오버라이딩 해놨어서 값을비교해서 같으니 true 출력
		char[] arr = new char[] {'a','b','c'};
		String str5 = new String(arr); //교재 469쪽 첫번째 메서드
		System.out.println(str5.charAt(1));
		
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def"); //일반문자열 
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def"); //정규표현식을 넣어주는것 (리플레이스와 기능은 비슷하고 출력결과는 같음)
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "200101-3011111"; //ㄱ
		String reg[] = str9.split("-");
		for (String tmp : reg) {
			System.out.println(tmp);
		}
		String str10 = "사과, 배, 오렌지";
		reg = str10.split(", "); //reg에는 0번지에는 사과, 1번지에는 배, 2번지에는 오렌지가 저장되어있음
		for (String tmp : reg) {
			System.out.println(tmp);
		}
		System.out.println(str10.substring(0));
		System.out.println(str10.substring(1));
		
		//reg 배열에 저장된 각 문자열을 구분자 - 를 기준으로 하나의 문자열로 만들어준다.
		String str11 = String.join("-", reg);
		System.out.println(str11);
	}

}
