package com.eli.bbp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbPasswordImpl implements PasswordDecodable {

    @Value("${db.password}")
    private String password;

    @Override
    public String getEncodedPassword() {
        return this.password;
    }

    @Override
    public void setDecodedPassword(String password) {
        this.password = password;
    }
}
