package day0325;

public class Ex8_SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SmartPhone 객체 생성
		SmartPhone myPhone=new SmartPhone("갤럭시","은색");
		//Phone으로부터 상속받는 필드 열기
		System.out.println("모델 : "+myPhone.model);
		System.out.println("색상 : "+myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : "+myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 신완철인뎁쇼");
		myPhone.sendVoice("아 예 그러시군요");
		myPhone.hangUp();
		
		//SmartPhone 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
