package model.prototype.deep;

import java.util.ArrayList;

/**
 * Created by linziy on 2018/1/10.
 */
public class DeepPrototype implements Cloneable{
    //容器的拷贝不能直接调用supper.clone()
    private ArrayList list = new ArrayList<>();

    public DeepPrototype clone(){
        DeepPrototype prototype = null;
        try{
            //对java 的 8 种基本数据类型进行copy
            prototype = (DeepPrototype)super.clone();
            //由于ArrayList不是基本类型，所以成员变量list，不会被拷贝，需要我们自己实现深拷贝，
            // 幸运的是java提供的大部分的容器类都实现了Cloneable接口。所以实现深拷贝并不是特别困难。
            prototype.list = (ArrayList)this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
