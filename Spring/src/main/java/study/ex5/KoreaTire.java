package study.ex5;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire {
    public String getTireName() {
        return "한국타이어";
    }
}
