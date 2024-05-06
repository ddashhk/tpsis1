package com.uniplan.model.perechisl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeOFtask {
    USTNO("Устно"),
    WRITE("Письменно"),
    DES("Дизайн"),
    PROGA("Программа"),
    OTCHET("Отчёт");

    private final String name;
}