package model.adapter.extend;

import model.adapter.Adaptee;
import model.adapter.Target;

/**
 * Created by linziy on 2018/1/13.
 * 类适配器，因为 Adapter 类既继承了 Adaptee （被适配类），也实现了 Target 接口（因为 Java 不支持多继承，所以这样来实现），
 * 在 Client 类中我们可以根据需要选择并创建任一种符合需求的子类，来实现具体功能。另外一种适配器模式是对象适配器，
 * 它不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式，类图如下：
 */
public class AdapterClass extends Adaptee implements Target {
    public void request(){
        super.specificRequest();
    }
}


