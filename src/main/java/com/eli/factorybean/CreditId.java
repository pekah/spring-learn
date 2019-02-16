package com.eli.factorybean;

import lombok.Data;

/**
 * Created by elizhou on 2019/2/16.
 */
@Data
public class CreditId {

    private String name;

    private String id;

    public CreditId(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
