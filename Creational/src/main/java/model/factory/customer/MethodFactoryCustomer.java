package model.factory.customer;

import model.factory.common.vo.bmw.BMW523;
import model.factory.classify.methodfactory.FactoryBMW523;
import model.factory.classify.methodfactory.FactoryBMW320;
import model.factory.common.vo.bmw.BMW320;

/**
 * Created by linziy on 2018/1/9.
 * 工厂方法的使用
 */
public class MethodFactoryCustomer {

    public final static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
