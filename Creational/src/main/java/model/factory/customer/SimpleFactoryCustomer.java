package model.factory.customer;

import model.factory.common.type.BMWEnum;
import model.factory.classify.simplefactory.SimpleFactory;
import model.factory.common.vo.bmw.BMW;

/**
 * Created by linziy on 2018/1/9.
 * 简单工厂的使用方式
 */
public class SimpleFactoryCustomer {
    public final static void main(String args[]){
        //简单工厂模型创建
        SimpleFactory simpleFactory = new SimpleFactory();
        BMW bmw320 = simpleFactory.createBMW(BMWEnum.BMW320);
        BMW bmw523 = simpleFactory.createBMW(BMWEnum.BMW523);
    }
}
