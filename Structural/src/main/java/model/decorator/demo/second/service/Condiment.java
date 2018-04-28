package model.decorator.demo.second.service;

/**
 * Created by linziy on 2018/4/28.
 * 配料的基类 (装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料，相当于demo.first 的Decorator)
 */
public abstract class Condiment extends Humburger {
    public abstract String getName();
}
