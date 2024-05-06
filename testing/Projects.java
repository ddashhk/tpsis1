package com.uniplan.model;

import com.uniplan.model.perechisl.TypeOFtask;
import com.uniplan.model.perechisl.Status;
import com.uniplan.model.perechisl.vazhnost;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Projects {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String date;
    @Enumerated(EnumType.STRING)
    private TypeOFtask typeOFtask;
    @Enumerated(EnumType.STRING)
    private vazhnost vazhnost;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tasks> tasks;

    public Projects(String name, String date, TypeOFtask typeOFtask, vazhnost vazhnost) {
        this.name = name;
        this.date = date;
        this.typeOFtask = typeOFtask;
        this.vazhnost = vazhnost;
        status = Status.WAITING;
        tasks = new ArrayList<>();
    }
}
