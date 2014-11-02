package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        //构造spring应用环境
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        HelloService helloService = context.getBean(HelloService.class);
//        System.out.println(helloService.sayHello());
//        HelloService helloService = new HelloService();
//        System.out.print(helloService.sayHello());
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IHelloService helloService = (IHelloService)context.getBean("service");
        System.out.println(helloService.sayHello());
    }

}
