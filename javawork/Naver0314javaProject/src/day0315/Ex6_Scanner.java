package day0315;

import java.util.Scanner;

public class Ex6_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int kor,eng;
		String name;
		System.out.println("국어점수는?");
		kor=sc.nextInt();
		System.out.println("영어점수는?");
		eng=sc.nextInt(); // 숫자와 문자를 혼용해서 할 경우 nextLine을 사용하는 것이 좋다
		//버퍼의 엔터를 읽어서 소멸
		sc.nextLine();
		
		System.out.println("이름은?");
		name=sc.nextLine();//정수뒤의 엔터를 읽어온다(엔터가 버퍼에 저장되어있는 상태)
		
		System.out.println("이름:"+name);
		System.out.printf("국어점수:%d점,영어점수:%d점\n",kor,eng);
		System.out.printf("총점 : %d점,평균:%d점",kor+eng,(kor+eng)/2);
	
		
				
	}

}
