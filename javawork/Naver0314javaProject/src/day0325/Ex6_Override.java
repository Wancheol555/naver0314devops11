package day0325;

class Parent2
{
	public void job()
	{
		System.out.println("부모클래스에서 해야할일 처리...");
	}
}

class Sub2 extends Parent2
{
	@Override
	public void job() {
		// TODO Auto-generated method stub
		super.job();//같은 이름의 매서드가 현재 클래스에 존재(오버라이드)하므로 부모가 가진 매서드 호출시 반드시 super로 호출한다
		System.out.println("자식 클래스에서 처리해야할 일...");
	}
}

public class Ex6_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s=new Sub2();
		s.job(); //sub2가 가진 job method가 호출
	}

}
