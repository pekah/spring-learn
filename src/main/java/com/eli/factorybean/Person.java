package com.eli.factorybean;

public class Person {

    private Address address;

    private CreditId creditId;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCreditId(CreditId creditId) {
        this.creditId = creditId;
    }

    public void printInfo() {
        System.out.println("地址信息:" + address.getProvince() + "," + address.getCity());
        System.out.println("身份证信息:" + creditId.getName() + "," + creditId.getId());
    }


}
