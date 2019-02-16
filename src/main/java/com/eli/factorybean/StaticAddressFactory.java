package com.eli.factorybean;

public class StaticAddressFactory {

    /**
     * 使用静态工厂方法返回bean
     * @return
     */
    public static Address getInstance() {
        return new Address("广东省", "深圳市");
    }
}
