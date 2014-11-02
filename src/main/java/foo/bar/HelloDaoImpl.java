package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class HelloDaoImpl implements HelloDao {
    public String sayHello() {
        return "nihao!";
    }
}

