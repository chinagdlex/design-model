package model.proxy.service.impl;

import model.proxy.service.BuyCar;

/**
 * Created by linziy on 2018/4/28.
 */
public class ProxyClass implements BuyCar {
    private People people;

    public People getPeople(){
        return people;
    }

    public void setPeople(People people){
        this.people = people;
    }

    public void doBuyCar(){
        if(people.getVip() == "vip"){
            people.doBuyCar();
            return;
        }
        if (people.getCash() >= 50000){
            System.out.println(people.getUsername() + "买了新车,交易结束！");
        }else{
            System.out.println(people.getUsername() + "钱不够,不能买车，继续比赛！");
        }
    }
}
