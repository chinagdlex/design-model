package model.builder.multiple.build;

import model.builder.multiple.common.Person;

/**
 * Created by linziy on 2018/1/10.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
