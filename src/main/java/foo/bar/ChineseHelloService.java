package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class ChineseHelloService implements IHelloService {
    @Override
    public String sayHello() {
        return "你好!!";
    }
}
