package day0320;

import java.util.Scanner;

public class Ex10_ArraySearchStartsWtih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String searchName;
		String []members= {"가민","가구","가준","나민","나랑드","다민","라민","마민","바민","사민","아민","자민"};
		int count;
		
		while(true)
		{
			count=0;
			
			System.out.println("검색할 이름은?");
			searchName=sc.nextLine();
			
			if(searchName.equalsIgnoreCase("q"))
			{
				System.out.println("**검색을 종료합니다**");
				break;
			}
			
			for(int i=0;i<members.length;i++)
			{
				if(members[i].startsWith(searchName))
				{
					count++;
					System.out.printf("\t%d 번째 : %s\n",i+1,members[i]);
				}
			}
			if(count==0)
				System.out.println("\t"+searchName+"\"로 시작하는 멤버는 없습니다");
			else
				System.out.println("\t총 "+count+" 명 검색");
			System.out.println();
		}

	}

}
