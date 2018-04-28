package model.decorator.demo.first.extend;

import model.decorator.demo.first.service.Human;

/**
 * Created by linziy on 2018/4/28.
 */
public class Decorator_two extends Decorator {
    public Decorator_two(Human human){
        super(human);
    }

    public void findClothes(){
        System.out.println("找到一件D&G...");
    }

    public void findTheTarget(){
        System.out.println("在Map上找到神秘花园和城堡...");
    }

    @Override
    public void wearClothes(){
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere(){
        super.walkToWhere();
        findTheTarget();
    }
}
