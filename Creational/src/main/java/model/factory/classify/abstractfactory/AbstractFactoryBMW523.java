package model.factory.classify.abstractfactory;

import model.factory.common.vo.accessories.aircondition.AirconditionB;
import model.factory.common.vo.accessories.engine.EngineB;
import model.factory.common.vo.accessories.aircondition.Aircondition;
import model.factory.common.vo.accessories.engine.Engine;

/**
 * Created by linziy on 2018/1/9.
 */
public class AbstractFactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
