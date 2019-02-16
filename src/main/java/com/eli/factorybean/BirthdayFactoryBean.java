package com.eli.factorybean;

import org.joda.time.DateTime;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by elizhou on 2019/2/16.
 */
public class BirthdayFactoryBean implements FactoryBean<DateTime> {

    @Override
    public DateTime getObject() throws Exception {
        return new DateTime().plusDays(1);
    }

    @Override
    public Class<?> getObjectType() {
        return DateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
