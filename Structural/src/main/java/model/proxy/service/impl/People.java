package model.proxy.service.impl;

import model.proxy.service.BuyCar;

/**
 * Created by linziy on 2018/4/28.
 */
public class People implements BuyCar {
    private int cash;
    private String vip;
    private String username;

    public void doBuyCar() {
        System.out.println(username + "是vip 客户，可以直接购买新车!");
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }
}
