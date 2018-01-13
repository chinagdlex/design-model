package model.adapter.extend;

import model.adapter.Adaptee;
import model.adapter.Target;

/**
 * Created by linziy on 2018/1/13.
 * 适配器类,直接关联被适配类，同时实现标准接口
 */
public class Adapter implements Target{
    //直接关联被适配类
    private Adaptee adaptee;

    //可以通过构造函数传入具体需要适配的被适配类的对象
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }




}