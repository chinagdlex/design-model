package model.factory.classify.simplefactory;

import model.factory.common.vo.bmw.BMW320;
import model.factory.common.vo.bmw.BMW523;
import model.factory.common.type.BMWEnum;
import model.factory.common.vo.bmw.BMW;

/**
 * Created by linziy on 2018/1/9.
 * 简单工厂模型:开闭合原则不太好
 */
public class SimpleFactory {
    public BMW createBMW(BMWEnum bmwEnum){
        switch(bmwEnum){
            case BMW320:
                return new BMW320();
            case BMW523:
                return new BMW523();
        }
        return null;
    }

}
