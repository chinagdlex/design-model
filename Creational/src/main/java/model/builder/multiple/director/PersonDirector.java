package model.builder.multiple.director;

import model.builder.multiple.build.PersonBuilder;
import model.builder.multiple.common.Person;

/**
 * Created by linziy on 2018/1/10.
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
