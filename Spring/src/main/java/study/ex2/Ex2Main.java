package study.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appex2.xml");
        Student stu=(Student)context.getBean("stu");
        stu.show();
    }
}
