package foo.bar;

import foo.bar.dao.HelloDao;

/**
 * Created by xueqian on 11/2/14.
 */
public class HelloServiceImpl implements HelloService {
    private HelloDao helloDao;

    @Override
    public void service(){
        System.out.println(helloDao.sayHello());
    }

    public void setDao(HelloDao helloDao){
        this.helloDao = helloDao;
    }

    public HelloDao getDao(){
        return helloDao;
    }
}
