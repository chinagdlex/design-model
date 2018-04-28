package model.decorator.demo.second.service;

/**
 * Created by linziy on 2018/4/28.
 */
public abstract class Humburger {
    protected String name ;
    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
