package model.factory.classify.abstractfactory;

import model.factory.common.vo.accessories.aircondition.AirconditionA;
import model.factory.common.vo.accessories.engine.EngineA;
import model.factory.common.vo.accessories.aircondition.Aircondition;
import model.factory.common.vo.accessories.engine.Engine;

/**
 * Created by linziy on 2018/1/9.
 */
public class AbstractFactoryBMW320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
