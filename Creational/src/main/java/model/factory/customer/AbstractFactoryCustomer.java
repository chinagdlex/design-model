package model.factory.customer;


import model.factory.classify.abstractfactory.AbstractFactoryBMW320;
import model.factory.classify.abstractfactory.AbstractFactoryBMW523;
import model.factory.common.vo.accessories.aircondition.Aircondition;
import model.factory.common.vo.accessories.engine.Engine;

/**
 * Created by linziy on 2018/1/9.
 * 抽象工厂方法的使用
 */
public class AbstractFactoryCustomer {

    public final static void main(String[] args) {
        //抽象工厂模型 获取对应BMW 车辆的配件对象
        //生产宝马320系列配件
        AbstractFactoryBMW320 factoryBMW320 = new AbstractFactoryBMW320();
        Engine engine320 = factoryBMW320.createEngine();
        Aircondition aircondition320 = factoryBMW320.createAircondition();

        //生产宝马523系列配件
        AbstractFactoryBMW523 factoryBMW523 = new AbstractFactoryBMW523();
        Engine engine523 = factoryBMW523.createEngine();
        Aircondition aircondition523 = factoryBMW523.createAircondition();
    }

}
