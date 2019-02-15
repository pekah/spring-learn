package com.eli.factorybean;

public class Person {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printAddress() {
        System.out.println(address.getProvince() + "," + address.getCity());
    }
}
