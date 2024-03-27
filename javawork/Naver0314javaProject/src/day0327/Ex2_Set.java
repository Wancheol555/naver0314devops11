package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new TreeSet<String>();
		set1.add("이청아");
		set1.add("아이유");
		set1.add("차은우");
		set1.add("카리나");
		set1.add("유재석");
		set1.add("박명수");
		
		System.out.println("Set1 의 갯수 : "+set1.size());
		
		System.out.println("**출력 1**");
		for(String s:set1)
			System.out.println(s);
		
		System.out.println("**출력2**");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
