package study.ex5;

import org.springframework.stereotype.Component;

@Component
public class CanadaTire implements Tire {
    public String getTireName() {
        return "캐나다타이어";
    }
}
