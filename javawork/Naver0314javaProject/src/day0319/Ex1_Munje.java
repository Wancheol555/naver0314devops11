package day0319;

public class Ex1_Munje {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 1-100 사이의 소수를 모두 출력하고 몇개인지 갯수를 구하라
		 * 소수? 1을 제외하고 자기자신만을 약수로 가지고 있는 수 (다중 for문)
		 * 
		 * 2. 1!=1
	 * 		  2!=2
		 *    3!=6
		 *    4!=24...10 까지 출력
		 *    
		 * 3. XY+YX=121이 나오는 X,Y 모두 구하기 
		 * 단, x y 는  1-9 사이의 한자리 숫자임
		 * 예) 29+92=121
		 * 
		 *
		 */
		//1.번
//		int count =0;
//		Loop:
//        for(int i=1;i<=100;i++)
//        {
//            for(int j=2;j<i; j++) 
//            {
//                if (i%j==0) 
//                    continue Loop;
//                }
//                count++;
//                System.out.printf("%3d",i);
//                if(count==0)
//                	
//                	System.out.println();
//                
//            }
//            System.out.println("소수의 갯수 : "+count);
//    		System.out.println("1부터 100 사이의 소수 개수: " + count);
//         }
//
//	{

//	        //2.번
//	        System.out.println("-----------2번문제--------------");
//	       
//	        for (int i = 1; i <= 10; i++) 
//	        {
//	            long factorial = 1;
//	            for (int j = 1; j <= i; j++) {
//	                factorial *= j;
//	            }
//	            System.out.println(i + "!=" + factorial);
//	        }
//}
	        System.out.println("===============3번문제==================");
	        for (int x = 1; x <= 9; x++) {
	            for (int y = 1; y <= 9; y++) {
	                int sum = x * 10 + y + y * 10 + x;
	                if (sum == 121) {
	                    System.out.println(x + "" + y + " + " + y + "" + x + " = 121");
	                    
	               }
	            }
	        }
	}
}
