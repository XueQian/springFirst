package foo.bar.dao;

import foo.bar.dao.HelloDao;
import org.springframework.stereotype.Component;

@Component
public class HelloDaoImpl implements HelloDao {
    public String sayHello() {
        return "nihao!";
    }
}

