package com.eli.bbp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PasswordDecodePostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PasswordDecodable) {
            String encodedPassword = ((PasswordDecodable) bean).getEncodedPassword();
            String decodePassword = "decodeSuc" + encodedPassword;
            ((PasswordDecodable) bean).setDecodedPassword(decodePassword);
        }

        return bean;
    }
}
