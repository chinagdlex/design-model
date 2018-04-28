package model.proxy;

import model.proxy.service.impl.People;
import model.proxy.service.impl.ProxyClass;

/**
 * Created by linziy on 2018/4/28.
 * 代理模式 :https://blog.csdn.net/jason0539/article/details/22974405
 * 代理模式主要使用了java的多态，干活的是被代理类，代理类主要是接活，你让我干活，好，我交给幕后的类去干，你满意就成，
 * 那怎么知道被代理类能不能干呢？同根就成，大家知根知底，你能做啥，我能做啥都清楚得很，同样一个接口。
 */
public class Test {
    public static void main(String[] args) {
        People people_1 = new People();
        people_1.setCash(60000);
        people_1.setUsername("jeck");

        People people_2 = new People();
        people_2.setCash(40000);
        people_2.setUsername("rose");

        People people_3 = new People();
        people_3.setCash(0);
        people_3.setUsername("tom");
        people_3.setVip("vip");

        ProxyClass proxy_buy = new ProxyClass();
        proxy_buy.setPeople(people_1);
        proxy_buy.doBuyCar();

        proxy_buy.setPeople(people_2);
        proxy_buy.doBuyCar();

        proxy_buy.setPeople(people_3);
        proxy_buy.doBuyCar();
    }
}
