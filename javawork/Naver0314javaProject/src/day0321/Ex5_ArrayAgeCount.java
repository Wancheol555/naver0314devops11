package day0321;

public class Ex5_ArrayAgeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []memberAges= {12,7,5,56,34,21,15,9,18,21,31,50,47,42,33,27,19,3,12,40};
		System.out.println("총 인원수 : "+memberAges.length);
		int []ageCount=new int[6];
		/*
		 * 연령별 인원수를 구해서 출력하시오
		 * ex)
		 * 10세미만 : 3명
		 * 10대 : 5명
		 * 20대: 2명
		 * ...
		 * 50대 : 1명
		 */
		for(int i=0;i<memberAges.length;i++)
		{
			ageCount[memberAges[i]/10]++;
		}
		System.out.println("** 연령별 인원수 구하기 **");
		for(int i=0;i<ageCount.length;i++)
		{
			if(i==0)
				System.out.println("10세 미만 : "+ageCount[i]+"명");
			else
				System.out.println(i*10+"대:   "+ageCount[i]+"명");
		}
		
		
	

	}

}
