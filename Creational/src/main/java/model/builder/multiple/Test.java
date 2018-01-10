package model.builder.multiple;

import model.builder.multiple.common.Person;
import model.builder.multiple.build.ManBuilder;
import model.builder.multiple.build.WomanBuilder;
import model.builder.multiple.director.PersonDirector;

/**
 * Created by linziy on 2018/1/10.
 */
public class Test {
    public final static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        Person manPerson = pd.constructPerson(new WomanBuilder());
    }
}



