package model.builder.single;

/**
 * Created by linziy on 2018/1/10.
 */
public class SinglePersonTest {
    public final static void main(String[] args) {
        SinglePersonBuilder builder = new SinglePersonBuilder();
        SinglePerson person = builder.buildPerson();
    }
}
