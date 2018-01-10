package model.builder.single;

/**
 * Created by linziy on 2018/1/10.
 * 具体的被建造对象只有一个的话，可以省略抽象的Builder和Director,让ConcreteBuilder自己扮演指导者和建造者双重角色，
 * 甚至ConcreteBuilder也可以放到Product里面实现。
 */
public class SinglePersonBuilder {
    SinglePerson singlePerson;

    public SinglePersonBuilder() {
        singlePerson = new SinglePerson();
    }


    public void buildBody() {
        singlePerson.setBody("建造单个人的身体");
    }

    public void buildFoot() {
        singlePerson.setFoot("建造单个人的脚");
    }

    public void buildHead() {
        singlePerson.setHead("建造单个人的头");
    }

    public SinglePerson buildPerson() {
        return singlePerson;
    }
}
