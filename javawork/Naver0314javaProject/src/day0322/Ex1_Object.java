package day0322;

class Apple
{
	String msg="Happy Day!!";//인스턴스 멤버변수
	static String message="오늘은 금요일";//static 멤버변수(클래스 멤버변수)
}

class Banana{
	static int kor=100;
	static int eng=80;
	String name="마이클";
}

public class Ex1_Object { //파일명과 같은 클래스는 public을 붙일 수 있음
	String name="홍길동";//인스턴스 변수
	final static int Max=100;//static 변수 , final : 상수 지정, 값변경이 안 됌
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static 멤버 매서드는 static 멤버 변수나 멤버매서드만 접근이 가능하다. 
		 * 일반 인스턴스 매서드나 변수를 접근하기 위해서는 new로 생성 후
		 * 그 변수를 이용해서 호출해야만 한다
		 */
		//System.out.println(name);//오류 발생
		System.out.println(Ex1_Object.Max);//static 변수는 클래스명.변수명
		System.out.println(Max);//같은 클래스일 경우는 앞에 클래스명은 생략이 가능한다
		
		//name을 출력하려면 new로 생성한 인스턴스 변수가 필요하다
		Ex1_Object ex=new Ex1_Object();
		//ex가 인스턴스 변수이다. 이 변수를 이용해야만 name이 접근이 가능하다
		System.out.println(ex.name);
		
		//Apple이 가진 2개의 멤버변수를 출력해보세요
		System.out.println(Apple.message);
		Apple apple=new Apple();
		System.out.println(apple.msg);
		
		//Banana 클래스의 kor,eng 점수를 출력하고 합계도 출력
		//Banana 클래스의 name도 출력해보세요
		Banana ba=new Banana();
		int sum=Banana.kor+Banana.eng;
		System.out.println(ba.name);
		System.out.println("국어점수: "+Banana.kor);
		System.out.println("영어점수: "+Banana.eng);
		System.out.println("합계: "+sum);
		

	}

}
