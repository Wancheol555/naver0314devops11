package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set 인터페이스를 구현한 클래스로는 TreeSet,HashSet이 있다
		 * Set 타입의 특징
		 * 1.중복데이타를 허용하지 않는다
		 * 2.비순차적
		 * 3.TreeSet은 오름차순으로 들어간다 / HashSet은 그냥 자기 마음대로 들어간다 -둘 다 내가 넣은대로 나오지않음
		 */
		//<Integer> : 제네릭, 해당 컬렉션에는 Integer 타입만 넣을 수 있다. 다른 타입을 넣을 경우 컴파일 오류 발생
		Set<Integer> set1=new TreeSet<>();
		set1.add(100); //JDK 이전에는 set1.add(new Integer(100))
		set1.add(78);
		set1.add(78);
		set1.add(100);
		set1.add(65);
		
		System.out.println("set1의 데이타 갯수 : "+set1.size());//3개, 중복데이타는 1번만 포함
		System.out.println("**출력1**");
		for(int n:set1)
		{
			System.out.println(n);
		}
		System.out.println("**출력2**");
		Iterator<Integer> iter=set1.iterator();//상속 안 됌
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		}

}
