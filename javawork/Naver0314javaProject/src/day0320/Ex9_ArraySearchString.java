package day0320;

import java.util.Scanner;

public class Ex9_ArraySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 검색할색(searchName)을 입력하여 배열에 몇번째에 있는지 출력
		 * 없을경우 없다고 메세지 출력,
		 * 반복해서 검색('q'나 'Q'입력시 종료)
		 */
		Scanner sc=new Scanner(System.in);
		String []members= {"가민","나민","다민","라민","마민","바민","사민","아민","자민"};
		int searchIndex;
		String searchName;
		while(true) 
		{
			searchIndex=-1;
			System.out.println("검색할 이름을 입력하세요");
			searchName=sc.nextLine();
			if(searchName.equalsIgnoreCase("q"))
			{
				System.out.println("검색을 종료합니다");
				break;
			}
			
			for(int i=0;i<members.length;i++)
			{
				if(searchName.equals(members[i]))
				{
					searchIndex=i;
					break;
				}
				
			}
		if(searchIndex==-1)
			System.out.println("\t"+searchName+"은 명단에 없습니다");
		else
			System.out.println("\t"+searchName+"은"+(searchIndex+1)+"번째에 있습니다");
		System.out.println();
		}

	}

}
