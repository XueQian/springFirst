package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class EnglishHelloService implements IHelloService {
    public String sayHello() {
        return "Hello world!";
    }
}

