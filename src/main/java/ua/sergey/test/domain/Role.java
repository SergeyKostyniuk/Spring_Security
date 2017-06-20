package ua.sergey.test.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER,
    POWER_USER,
    ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
