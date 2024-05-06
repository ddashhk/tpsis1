package com.uniplan.model.perechisl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    ADMIN("Админ"),
    MANAGER("Менеджер"),
    EMPLOYEE("Сотрудник");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}


