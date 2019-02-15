package com.eli.factorybean;

public class StaticAddressFactory {

    public static Address getInstance() {
        return new Address("广东省", "深圳市");
    }
}
