package day0322;

import java.util.Scanner;
//Call By Reference 를 확인하기 위한 예제
public class Ex7_ClassSawonArray {
	
	//입력받는 매서드
	static public void inputSawonArray(Sawon []sa)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("총"+sa.length+" 명의 사원정보를 입력하세요");
		for(int i=0;i<sa.length;i++)
		{
			System.out.print("사원명은?");
			String name=sc.nextLine();
			System.out.println("기본급은?");
			int gibon=Integer.parseInt(sc.nextLine());
			System.out.println("수당은?");
			int sudang=Integer.parseInt(sc.nextLine());
			
			sa[i]=new Sawon();//초기값이 null이므로 new로 생성을 해야 매서드 호출이 가능하다
			sa[i].setSawon(name, gibon, sudang);//생성을 안 하고 호출시 널포인트 오류 발생
			
			System.out.println();
					
			
		}
	}
	//출력하는 매서드
	
	static public void outputSawonArray(Sawon []sa)
	{
		System.out.println("\t\t[사원 급여 현황]\n");
		System.out.println("번호\t사원명\t기본급\t수당\t실수령액");
		System.out.println("=".repeat(60));
		
		for(int i=0;i<sa.length;i++)
		{
			System.out.println(i+1+"\t"+sa[i].getName()+"\t"+sa[i].getGibon()+"\t"+sa[i].getSudang()+"\t"+sa[i].getNetPay());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon []sawon=null;
		int inwon;
		Scanner sc=new Scanner(System.in);
		System.out.println("직원 인원수는?");
		inwon=Integer.parseInt(sc.nextLine());
		//인원수만큼 메모리 할당
		sawon=new Sawon[inwon];//인원수만큼 객체 할당, 초기값은 null
		
		inputSawonArray(sawon);
		outputSawonArray(sawon);
	}

}
