package model.prototype.sallow;

/**
 * Created by linziy on 2018/1/10.
* Object类的clone方法只会拷贝对象中的基本的数据类型（8种基本数据类型byte,char,short,int,long,float,double，boolean），对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
 */
public class ShallowPrototype implements Cloneable {
    //clone() 是Object 中的方法,继承可将protected 修改为public
    @Override
    public ShallowPrototype clone() {
        ShallowPrototype prototype = null;
        try {
            prototype = (ShallowPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
