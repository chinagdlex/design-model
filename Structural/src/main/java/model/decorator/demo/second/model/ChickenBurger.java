package model.decorator.demo.second.model;

import model.decorator.demo.second.service.Humburger;

/**
 * Created by linziy on 2018/4/28.
 */
public class ChickenBurger extends Humburger {
    public ChickenBurger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice(){
        return 10;
    }
}
