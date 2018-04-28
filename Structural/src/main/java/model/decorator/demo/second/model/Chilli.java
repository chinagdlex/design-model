package model.decorator.demo.second.model;

import model.decorator.demo.second.service.Condiment;
import model.decorator.demo.second.service.Humburger;

/**
 * Created by linziy on 2018/4/28.
 */
public class Chilli extends Condiment {
    Humburger humburger;
    public Chilli(Humburger humburger){
        this.humburger = humburger;
    }

    @Override
    public String getName(){
        return humburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice(){
        return humburger.getPrice();//辣椒是免费的
    }
}
