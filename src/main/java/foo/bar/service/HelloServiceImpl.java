package foo.bar.service;

import foo.bar.dao.HelloDao;
import foo.bar.entity.Item;

import java.util.Collection;

/**
 * Created by xueqian on 11/2/14.
 */
public class HelloServiceImpl implements HelloService {
    private HelloDao helloDao;
    private Collection<Item> items;

    @Override
    public void service(){
        System.out.println(helloDao.sayHello());
    }

    @Override
    public void getItems() {
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    public void setDao(HelloDao helloDao){
        this.helloDao = helloDao;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }
}
