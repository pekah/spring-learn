package com.eli.factorybean;

import lombok.Data;

@Data
public class Address {
    private String province;
    private String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }
}
