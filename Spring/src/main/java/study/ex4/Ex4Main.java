package study.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex4Main {
    ApplicationContext context = new ClassPathXmlApplicationContext("appex3.xml");

    MyCart cart=(MyCart)context.getBean("cart");
//        cart.showInfo();
}
