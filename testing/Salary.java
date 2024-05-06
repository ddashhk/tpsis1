package com.uniplan.model.perechisl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Salary {
    DESIGN("Дизайнер",2800),
    KOPIRAYT("Копирайтер",2600),
    RAZRAB("Разработчик",4700),
    PR("Маркетолог",3200);
    private final String name;
    private final int salary;
}

