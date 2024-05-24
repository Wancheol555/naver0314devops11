package study.ex5;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //@NonNull 이 붙은 멤버변수만 생성자로 주입된다
public class Car {
    @Value("audi")
    private String carName;
//    private Tire tire;
//    public Car(Tire tire){
//        this.tire=tire;
//    }
//
//    public void setCarName(String carName) {
//        this.carName = carName;
//    }
    @NonNull
    private CanadaTire tire; //정확하게 클래스명으로 선언을 해야만 로슈가 발생하지 않는다
    public void carInfo()
    {
        System.out.println("자동차명: "+carName);
        System.out.println("타이어: "+tire.getTireName());

    }
}

