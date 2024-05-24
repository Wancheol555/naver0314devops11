package anno.study.ex4;

import org.springframework.stereotype.Component;

@Component //xml에 자동 등록, 이경우는 클래스 이름이 곧 아이디가 된다(단 첫글자는 소문자로 변경)
public class Hello {
    public void showMessage()
    {
        System.out.println("Hello class 가 가진 메소드입니다");
    }
}
