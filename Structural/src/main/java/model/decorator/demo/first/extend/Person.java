package model.decorator.demo.first.extend;

import model.decorator.demo.first.service.Human;

/**
 * Created by linziy on 2018/4/28.
 */
public class Person implements Human {

    public void wearClothes() {
        System.out.println("穿什么呢...");
    }

    public void walkToWhere() {
        System.out.println("去哪里呢...");
    }

}
