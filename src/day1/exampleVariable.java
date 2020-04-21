package day1;

import java.util.Scanner;

public class exampleVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*콘솔에 원하는 문자열을 출력한 후에 엔터를 치는것(메소드)*/
	    /* 
		System.out.println("Hello world!");
	    System.out.println(7+7);
	    System.out.println(""+7+7);
	    System.out.println("7+7");
	    System.out.println("");
	    
	    System.out.println("쌉가능"); //얘는 엔터침
	    System.out.print("안녕");  //얘는 엔터안침

	    System.out.print("\n내가치는 작은엔터");

	    int num1 = 10, num2 = 20;
	    System.out.println(num1 + "," + num2);
	    num1=9;
	    num2=10;
	    System.out.println(num1 + "," + num2);
	    
	    System.out.printf("%d,%d\n",num1,num2);
	    System.out.printf("%2d,%2d\n",num1,num2);
	    
	    double dnum = 1.23;

	    System.out.println(dnum);
	    System.out.printf("%f\n",dnum);
	    System.out.printf("%.4f\n",dnum);
	    System.out.printf("%7.4f\n",dnum);
	    
	    //System.out.println();
	    //System.out.print();
	    //System.out.printf();
	     
	     이거까지 오전 
	     */
	    System.out.println("입력하세염 숫자를.\n");

	    Scanner scan = new Scanner(System.in);
	    //Scanner scan = new Scanner(System.in); 에서 scan 부분만 바꿀수있음.

	    int num = scan.nextInt();

	    System.out.println("퉷"+num);
	    
	    
	    System.out.println("입력하세염 글자를.\n");

	    char ch = scan.next().charAt(0);

	    System.out.println(ch+" 이것만 줄께!\n");
	    
	    System.out.println("\n입력하세염 문장을.\n");
	    
	    String str = new String();
	    //문자열을 관리하는 String 클래스
	    
	    str = scan.next();
	    	    
	    System.out.println("입력한건  "+str);


	    scan.close();

	}

}