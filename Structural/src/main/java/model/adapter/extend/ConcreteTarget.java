package model.adapter.extend;

import model.adapter.Target;

/**
 * Created by linziy on 2018/1/13.
 */
public class ConcreteTarget implements Target {
    //具体目标类，只提供普通功能
    public void request(){
        System.out.println("普通类 具有 普通功能...");
    }

}
