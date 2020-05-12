package day14;

import java.util.Objects;

public class ObjectsEx1 {
//Object와 Objects의 가장 큰 차이는 null을 허용 하느냐, 허용하지 않느냐.
	public static void main(String[] args) {
		String str = null;
		//isNull의 반대가 !  isNull 이랑 nonNull
		System.out.println("객체 str은 null값입니까 ? "+ Objects.isNull(str));
		System.out.println("객체 str은 null값이 아닙니까 ? "+ !Objects.isNull(str));
		System.out.println("객체 str은 null값이 아닙니까 ? "+ Objects.nonNull(str));
		
		String str2 = "";
		//System.out.println(str.equals(str2)); //Object클래스에 정의된 equals라서(객체가 필요) 실행시 NullPointerException 예외 발생
		System.out.println(Objects.equals(str, str2)); // Object클래스에 정의된 equals라서 매개변수2개 써서 실행가능
		
		
	}

}
