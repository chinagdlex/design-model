package model.decorator.demo.first;

import model.decorator.demo.first.extend.*;
import model.decorator.demo.first.service.Human;

/**
 * Created by linziy on 2018/4/28.
 *装饰者模型: https://blog.csdn.net/jason0539/article/details/22713711
 */
public class Test {
    public static void main(String[] args){

        Human person = new Person();
        // 感悟:主体 Person 与 装饰者 Decorator 均继承同一个接口，然后使用构造函数来选择对应的装饰类进行类的功能扩展
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));

        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
