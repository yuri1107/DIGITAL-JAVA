package preparation;
//자바의 정석 예제 6-22, p.289
public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};

		System.out.println(concatenate("","100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		/* 14,15 줄을 하나로 합치면 17번째 줄과 같이 쓸 수 있다.
		String[] strArr = new String[] {"100","200","300"};
		System.out.println(concatenate("-",strArr));
		*/
		System.out.println(concatenate("-", new String[] {"100","200","300"})); 
	}
	
	static String concatenate(String delim, String...args) {
		String result = "";
		for (String str : args) {
			result += str+delim;
		}
		return result;
	}
/*	
	static String concatenate (String...args) {
		return concatenate("",args);
	}
*/
}
