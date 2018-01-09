package model.factory.classify.methodfactory;

import model.factory.common.vo.bmw.BMW320;

/**
 * Created by linziy on 2018/1/9.
 */
public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW320 createBMW(){
        return new BMW320();
    }

}
