package model.factory.classify.abstractfactory;

import model.factory.common.vo.accessories.aircondition.Aircondition;
import model.factory.common.vo.accessories.engine.Engine;

/**
 * Created by linziy on 2018/1/9.
 */
//创建工厂的接口
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
