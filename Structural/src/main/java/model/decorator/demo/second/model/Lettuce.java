package model.decorator.demo.second.model;

import model.decorator.demo.second.service.Condiment;
import model.decorator.demo.second.service.Humburger;

/**
 * Created by linziy on 2018/4/28.
 */
public class Lettuce extends Condiment {
    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加生菜 ";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }

}
