package foo.bar;

/**
 * Created by xueqian on 11/2/14.
 */
public class HelloServiceImpl implements HelloService {
    private HelloDao helloDao;

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
