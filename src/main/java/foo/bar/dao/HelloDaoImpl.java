package foo.bar.dao;

import org.springframework.stereotype.Component;

@Component
public class HelloDaoImpl implements HelloDao {
    public String sayHello() {
        return "nihao!";
    }

}

