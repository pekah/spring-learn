package com.eli.factorybean;

/**
 * Created by elizhou on 2019/2/16.
 */
public class NonStaticCreditIdFactory {

    public CreditId getInstance() {
        return new CreditId("张三", "4405281212451214");
    }
}
