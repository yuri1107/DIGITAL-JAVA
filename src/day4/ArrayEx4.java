package day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제.
		
		int arr[] = new int [3];
		int max = 9;
		int min = 1;
		//임의의 수를 생성하여 배열에 저장 (중복 가능)
		
		for(int i=0; i<arr.length; i++) {
			int random = (int) (Math.random()*(max-min+1)) + min;
			arr[i] = random;
		}
		
		//random이기 때문에 같은 인덱스를 호출할 수도 있음.
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}

		//임의의 수를 생성하여 배열에 저장 (중복X)
		//내생각엔 if문 써서 값이 같은지 비교하고 만약 값이 같다면 다시 랜덤 생성시킬듯
		//규칙적으로 값이 증가하지 않기때문에 반복문중에 while문을 쓰는것이 낫다.
		int cnt = 0; //배열에 저장된 랜덤수의 갯수
		int [] arr2 = new int [3];
		while (cnt < arr2.length) {
			//생성된 랜덤 수 (random): 
			//배열에 저장된 갯수 (cnt): 
			//저장된 배열의 값 (arr2): 
			int random = (int) (Math.random()*(max-min+1)) + min;
			int i = 0;
			while(i < cnt) {
				if(random == arr2[i]) {
					break;
				}
				i++;
			}
			if (i == cnt) {
				arr2[cnt] = random;
				cnt++;
			}
			
			//배열의 0번지부터 cnt2-1번지까지 중복여부 체크 후 
			//중복이 아니면 배열에 랜덤수를 저장하고
			//배열에 저장된 랜덤수의 갯수를 1 증가

			
		}
		System.out.println();
		
		for(int tmp : arr2) {
			System.out.print(tmp + " ");
		}		

		
		
		
		
		
		
	}

}
