package com.uniplan.model.perechisl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum vazhnost {
    IMPORTANT("Важные"),
    SROCHNO("СРОЧНО"),
    UNIMPORTANT("Неважные"),
    NEUTRAL("Нейтральные");

    private final String name;
}
