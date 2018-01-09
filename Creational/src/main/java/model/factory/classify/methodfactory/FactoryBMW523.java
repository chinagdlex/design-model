package model.factory.classify.methodfactory;

import model.factory.common.vo.bmw.BMW523;

/**
 * Created by linziy on 2018/1/9.
 */
public class FactoryBMW523 implements FactoryBMW{

    @Override
    public BMW523 createBMW(){
        return new BMW523();
    }
}
