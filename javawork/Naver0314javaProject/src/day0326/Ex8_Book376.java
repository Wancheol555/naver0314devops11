package day0326;

interface Tire
{
	void roll();
}
class HankookTire implements Tire
{
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("한국 타이어가 굴러갑니다");
	}
}

class KumhoTire implements Tire
{
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("금호 타이어가 구러갑니다");
	}
}
class Car
{
	//필드
	Tire tire1=new HankookTire();
	Tire tire2=new KumhoTire();
	//메소드
	void run()
	{
		tire1.roll();
		tire2.roll();
	}
}
public class Ex8_Book376 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동차 객체 생성
		Car myCar=new Car();
		//run()메소드 실행
		myCar.run();
		
		//타이어 객체 교체
		myCar.tire1=new HankookTire();
		myCar.tire2=new KumhoTire();
		
		//run() 메소드 실행(다형성: 결과가 다름)
		myCar.run();
	}

}
