package com.uniplan.model.perechisl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskStatus {
    FINISH("Выполнено"),
    VERIFICATION("На сдачу"),
    WAITING("Ожидание"),
    IN_PROGRESS("В процессе");

    private final String name;
}
