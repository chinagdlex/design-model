package model.decorator.demo.first.extend;

import model.decorator.demo.first.service.Human;

/**
 * Created by linziy on 2018/4/28.
 */
public class Decorator_first extends Decorator {
    public Decorator_first(Human human){
        super(human);
    }

    public void goColthespress(){
        System.out.println("去衣柜找找看...");
    }

    public void findPlaceOnMap(){
        System.out.println("在Map 上找找...");
    }

    @Override
    public void wearClothes(){
        super.wearClothes();
        goColthespress();
    }

    @Override
    public void walkToWhere(){
        super.walkToWhere();
        findPlaceOnMap();
    }
}
