package com.eli.bbp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by elizhou on 2018/6/21.
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor{
    private static final Logger log = LoggerFactory.getLogger(CustomBeanPostProcessor.class);

    public CustomBeanPostProcessor() {
        log.info("construct CustomBeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Bean4BBP) {
            log.info("process bean before initialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Bean4BBP) {
            log.info("process bean after initialization");
        }
        return bean;
    }
}
