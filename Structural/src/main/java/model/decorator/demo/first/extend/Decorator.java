package model.decorator.demo.first.extend;

/**
 * Created by linziy on 2018/4/28.
 */

import model.decorator.demo.first.service.Human;

/**
 *定义装饰者
 */
public class Decorator implements Human {
    private Human human;

    public Decorator(Human human){
        this.human = human;

    }

    public void wearClothes(){
        human.wearClothes();
    }

    public void walkToWhere(){
        human.walkToWhere();
    }
}
