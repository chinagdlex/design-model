package model.factory.common.type;

/**
 * Created by linziy on 2018/1/9.
 */
public enum BMWEnum {
    BMW320(1, "BMW320 - 宝马型号"),
    BMW523(2, "NMW523 - 宝马型号");

    private int sn; //序号
    private String desc;//描述

    private BMWEnum(int type, String desc) {
        this.sn = sn;
        this.desc = desc;
    }

    public int getSn() {
        return sn;
    }

    public String getDesc() {
        return desc;
    }

}
