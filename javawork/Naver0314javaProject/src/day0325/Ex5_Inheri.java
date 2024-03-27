package day0325;

//같은 패키지내에서는 부모가 가진 매서드중 private를 제외하고 모두 상속받음
class Parents1
{
	void method1()
	{
		System.out.println("부모의 디폴트 매서드");
	}
	protected void method2()
	{
		System.out.println("부모의 protected 매서드");
	}
	
	private void method3()
	{
		System.out.println("부모의 private 매서드");
	}
	
	public void method4()
	{
		System.out.println("부모의 public 매서드");
	}
}

//서브 클래스 구현
class Sub1 extends Parents1
{
	public void show()
	{
		/*
		 * 현재 클래스에 같은 이름의 매서드가 존재할 경우
		 * 부모 매서드 호출시 앞에 super로 호출
		 * 같은 이름의 메서드가 없을 경우 super 대신 this로 호출해도된다
		 * 부모와 같은 이름의 매서드를 Override Method 라고 한다
		 */
		System.out.println("this 로 호출");
		this.method1();//default, 부모가 다른 패키지에 있다면 default도 호출 안 됌 / 같은 구역안에 같은 변수가 있으면 this를 무조건 붙여야함
		this.method2();//protected
		//this.method3(); -private는 상속 안 됌
		this.method4();//public
		System.out.println("super 로 호출");
		super.method1();
		super.method2();
		super.method4();
	}
}

public class Ex5_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 s=new Sub1();
		s.show();
	}

}
